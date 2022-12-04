package com.example.uniparar.model;

public class Product {
    private float photo;
    private String name;
    private String description;
    private String price;


    // Getter Methods

    public float getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    // Setter Methods

    public void setPhoto(float photo) {
        this.photo = photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}