package org.webScrapper;

import org.webScrapper.document.Scrapper;
import org.webScrapper.domains.Mobiles;

import java.io.IOException;
import java.util.ArrayList;

public class App
{
    private static String link = "https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&page=";
    private static final int noOfPages = 469;

    public static void main( String[] args ) throws IOException
    {
        ArrayList<Mobiles> mobiles = new ArrayList<>();

        for(int i = 1;i <= noOfPages;i++){
            Scrapper scrapper = new Scrapper(link + i);
            mobiles.addAll(scrapper.scrap());

            System.out.println("Page " + i + " scrapped successfully");
            System.out.println("No. of products scrapped : " + mobiles.size());
        }
    }
}
