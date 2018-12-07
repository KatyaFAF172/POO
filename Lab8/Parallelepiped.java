package lab8;

public class Parallelepiped implements GeometricBody,Printobject {
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getSurface(){
        return 2 * length * width + 2 * length * height + 2 * width * height;

    }

    public double getVolume(){
        return length * width * height;
    }

    public void print() {
        System.out.println( " The surface area of a rectangular parallelepiped : " + getSurface());
        System.out.println( " The volume of a rectangular parallelepiped : " + getVolume());
    }
}
