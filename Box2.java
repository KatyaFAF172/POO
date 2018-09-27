package lab2;

public class Box2 {
    double width, height, depth;
    // constructor used when cube is created
    Box2(double a){
        width = height = depth = a;
    }
    double area(){
        return 2 * depth *height + 2 * depth * width + 2 * width * height;
    }
    double volume(){
        return width * height * depth;
    }
}
