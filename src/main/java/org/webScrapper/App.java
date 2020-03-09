package org.webScrapper;

import org.webScrapper.document.Scrapper;
import org.webScrapper.domains.Mobiles;

import java.util.ArrayList;

public class App
{
    private static String link = "https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off";

    public static void main( String[] args )
    {
        Scrapper scrapper = new Scrapper(link);
        ArrayList<Mobiles> mobiles = new ArrayList<>();

        try{
            mobiles.addAll(scrapper.scrap());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
