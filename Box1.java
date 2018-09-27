package lab2;

class myBox1{
    double width, height, depth;
    myBox1(){
        width = 5;
        height = 10;
        depth = 15;

    }
    double area(){
        return 2 * depth *height + 2 * depth * width + 2 * width * height;
    }
    double volume(){
        return width * height * depth;
    }
}

public class Box1 {
    public static void main(String args[]) {
        myBox1 box1 = new myBox1();
        double area;
        double volume;
        area = box1.area();
        System.out.println("Area is " + area);
        volume = box1.volume();
        System.out.println("Volume is " + volume);
    }
}
