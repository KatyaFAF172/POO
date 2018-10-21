package com.katea;
public class Monitor {
    String name;
    int height;
    int width;
    String color;


    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight(int height) {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth(int width) {
        return width;
    }

    public void setColor( String color){
        this.color = color;
    }

    public String getColor(String color){
        return color;
    }

    public static void compare(Monitor monitor1, Monitor monitor2) {
    }
}

