package com.example.dailiang.listviewtest;

/**
 * Created by DaiLiang on 2017/4/14.
 * ListView 适配器的适配类型
 */

class Fruit {
    private String name;
    private int imageId;

    Fruit(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    String getName(){
        return name;
    }

    int getImageId(){
        return imageId;
    }
}
