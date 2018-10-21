package com.katea;

public class Main {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        monitor1.setName("#1");
        monitor1.setHeight(1920);
        monitor1.setWidth(1080);
        monitor1.setColor("red");

        Monitor monitor2 = new Monitor();
        monitor2.setName("#2");
        monitor2.setHeight(1920);
        monitor2.setWidth(1080);
        monitor2.setColor("black");

        System.out.println("Name " + monitor1.name);
        System.out.println("height " + monitor1.height);
        System.out.println("width " + monitor1.width);
        System.out.println("color " + monitor1.color);

        System.out.println("Name " + monitor2.name);
        System.out.println("height " + monitor2.height);
        System.out.println("width " + monitor2.width);
        System.out.println("color " + monitor2.color);

        Monitor.compare(monitor1, monitor2);
        if ( monitor1.height == monitor2.height ){
            System.out.println("Equal");}
            else{
            System.out.println(" Not equal");
        }

        if ( monitor1.width == monitor2.width){
            System.out.println("  Equal ");
        }
        else {
            System.out.println(" Not equal ");
        }

        if ( monitor1.color == monitor2.color){
            System.out.println(" Equal");
        }
        else{
            System.out.println( "Not equal ");
        }


    }
}


















