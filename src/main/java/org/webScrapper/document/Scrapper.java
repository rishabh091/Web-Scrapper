package org.webScrapper.document;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.webScrapper.domains.Mobiles;

import java.io.IOException;
import java.util.ArrayList;

public class Scrapper {

    private final String link;
    private Services services;
    private ArrayList<Mobiles> mobiles;

    public Scrapper(String link){
        this.link = link;
        services = new Services();
        mobiles = new ArrayList<>();
    }

    public ArrayList<Mobiles> scrap() throws IOException {
        Document document = Jsoup.connect(link).get();
        System.out.println(document.title());

        Elements names = document.getElementsByClass("_3wU53n");
        Elements details = document.getElementsByClass("vFw0gD");
        Elements price = document.getElementsByClass("_1vC4OE");

        for(int i = 0;i < names.size();i++){
            Mobiles mobile = new Mobiles();

            mobile.setCategory("mobile");
            mobile.setName(names.get(i).text());
            mobile.setBrand(services.getBrand(names.get(i).text()));
            mobile.setModel(services.getModel(names.get(i).text()));

            StringBuilder stringBuilder = new StringBuilder();
            for(Element element: details.get(i).children()){
                stringBuilder.append(element.text());
                stringBuilder.append("\n");
            }

            mobile.setDetails(stringBuilder.toString());
            mobile.setPrice(price.get(i).text());

            mobiles.add(mobile);
        }

        return mobiles;
    }
}
