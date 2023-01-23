package com.company;

public class Category {
    private String name;

    //validator!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public Category(){
        this.name="";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null && name.length()>0)this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
