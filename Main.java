package com.katea;
public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        String name1 = "Monitor 1 ";
        String name2 = "Monitor 2" ;
        String color1 = "Red";
        String color2 = "red";
        int height1 = 1920;
        int height2 = 1920;
        int width1 = 1080;
        int width2 = 1080;
        //Monitor.addMonitor(name1, height1, width1, color1);
        if ( name1 == name2)
            System.out.println (" Equal ");
            else
                System.out.println( " Not equal ");
            if ( color1 == color2 )
                System.out.println ( "Equal");
            else
                System.out.println (" Not equal");
            if ( height1 == height2 )
                System.out.println (" Equal");
            else
                System.out.println (" Not Equal");
            if ( width1 == width2)
                System.out.println( "Equal");
            else
                System.out.println (" Not equal");
    }
}

















