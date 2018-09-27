package lab2;

public class Box {
    double height, width, depth;

    Box(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }
    // constructor used when no dimensions
    // specified
    Box()
    {
        width = height = depth = 0;
    }
    //compute and return area
    double area()
    {
        return 2 * depth *height + 2 * depth * width + 2 * width * height;
    }
    // compute and return volume
    double volume()
    {
        return width * height * depth;
    }
}
