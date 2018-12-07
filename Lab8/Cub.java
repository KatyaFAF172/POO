package lab8;

public class Cub implements GeometricBody, Printobject {
    double side;

    public Cub (double side){
        this.side = side;

    }

    public double getVolume()
    {
        return side * side * side;
    }

    public double getSurface(){
       return  6*(side*side);
    }

    public void print() {
        System.out.println( " The surface area of a cube : " + getSurface());
        System.out.println( " The volume of a cube : " + getVolume());
    }

}
