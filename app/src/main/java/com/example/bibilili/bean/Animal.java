package com.example.bibilili.bean;

public class Animal {
    private int image;
    private String title;
    public Animal(int image,String title){
        this.image=image;
        this.title=title;
    }
    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
