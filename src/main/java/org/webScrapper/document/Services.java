package org.webScrapper.document;

public class Services {

    public String getBrand(String productName){
        String[] arr = productName.split(" ");
        String result="";

        if(arr[0].length() == 1)
            result+=arr[0]+" "+arr[1];
        else
            result+=arr[0];

        return result;
    }

    public String getModel(String productName){
        if(productName.contains("(") && productName.contains(")")){
            return productName.substring(productName.indexOf('(')+1,productName.indexOf(')'));
        }

        return null;
    }
}
