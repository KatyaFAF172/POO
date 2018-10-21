package lab2;

public class Box {
    double height, width, depth;

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    Box(double value){
        width=value;
        height=value;
        depth = value;
    }

    // constructor used when no dimensions
    // specified
    Box()
    {
        width = height = depth = 1;
    }
    //compute and return area
    double getArea()
    {
        return 2 * depth *height + 2 * depth * width + 2 * width * height;
    }
    // compute and return volume
    double getVolume()
    {
        return width * height * depth;
    }

    public void print() {
        System.out.print("Box: ");
        System.out.println(""+width +" "+  depth +" "+ height);
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
