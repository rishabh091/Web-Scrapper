package org.webScrapper.domains;

public class Mobiles {

    private String name;
    private String price;
    private String brand;
    private String details;
    private String model;
    private String imgUrl;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Mobiles{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", brand='" + brand + '\'' +
                ", details='" + details + '\'' +
                ", model='" + model + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
