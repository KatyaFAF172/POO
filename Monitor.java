package com.katea;
public class Monitor{
    String name;
    int height;
    int width;
    String color;

    public static void addMonitor( String name1, int height1, int width1, String color1, String name2, int height2, int width2, String color2){
        Monitor monitor1 = new Monitor();
        monitor1.name = name1;
        monitor1.height = height1;
        monitor1.width = width1;
        monitor1.color = color1;
        System.out.println("Name1 :" + name1);
        System.out.println( "Color1 : " + color1);
        System.out.println( "Current Screen resolution : " + "w1 : " + width1 + " h1 : " + height1);

        Monitor monitor2 = new Monitor();
        monitor2.name = name2;
        monitor2.height = height2;
        monitor2.width = width2;
        monitor2.color = color2;
        System.out.println("Name2: " + name2 );
        System.out.println ("Color2 :" + color2);
        System.out.println (" Current Screen resolution : " + "w2 : " + width2 + " h2 : " + height2);
    }
}