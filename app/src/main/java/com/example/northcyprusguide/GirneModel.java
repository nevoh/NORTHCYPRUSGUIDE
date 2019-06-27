package com.example.northcyprusguide;

public class GirneModel {
    private String girneName;
    private int girneImage;

    public String getName(){
        return girneName;
    }

    public void setName(String name) {
        this.girneName = name;
    }

    public int getImage() {
        return girneImage;
    }

    public void setImage(int image){
        this.girneImage = image;
    }
}
