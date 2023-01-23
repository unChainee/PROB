package com.company;

public class Product {
    private String name = null;
    private Category category = new Category(null);
    private float price = 0;

    private Currency currency = Currency.PLN;

    public Product(){}

    public Product(String name, float price){
        this.setName(name);
        this.setPrice(price);
    }

    public Product(String name, Category category, float price){
        this.setName(name);
        this.setCategory(category);
        this.setPrice(price);
    }

    public Product(String name, Category category, float price, Currency currency) {
        this.setName(name);
        this.setCategory(category);
        this.setPrice(price);
        this.setCurrency(currency);
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        if(name.equals(null) || name.length()==0) System.out.println("Pole nie moze byc puste ani byc nullem");
        else this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPrice(float price) {
        if(price>0) {
            price-=price%0.01;
            this.price = price;
        }
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
