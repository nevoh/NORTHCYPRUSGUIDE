package com.example.northcyprusguide;

public class TrikomoModel {
    private String trikomoName;
    private int trikomoImage;

    public String getName(){
        return trikomoName;
    }

    public void setName(String name) {
        this.trikomoName = name;
    }

    public int getImage() {
        return trikomoImage;
    }

    public void setImage(int image){
        this.trikomoImage = image;
    }
}
