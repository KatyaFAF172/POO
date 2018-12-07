package lab8;

public class Sphere implements GeometricBody,Printobject{
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getSurface(){
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume(){
        return (4 * Math.PI * radius * radius * radius )/ 3;
    }

    public void print(){
        System.out.println(" The surface area of a sphere : " +getSurface());
        System.out.println(" The volume of a sphere : " +getVolume());
    }

}
