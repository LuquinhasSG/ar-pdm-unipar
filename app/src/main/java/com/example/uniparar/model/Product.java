package com.example.uniparar.model;

public class Product {

    private String name;
    private String description;
    private String price;
    private int photo;

    public Product(String name, String description, String price, int photo){
        this.name = name;
        this.description = description;
        this.price = price;
        this.photo = photo;
    }


    // Getter Methods
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public int getPhoto() {
        return photo;
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}