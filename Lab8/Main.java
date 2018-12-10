package lab8;

public class Main {
    public static void main(String[] args) {

        Cub cub = new Cub(5);
        Sphere sphere = new Sphere(8);
        Parallelepiped parallelepiped = new Parallelepiped(10,7,4);
        GeometricBody[] geometricBody = {cub, sphere, parallelepiped};
        System.out.println("Figure with biggest volume: " + GeometricBodyController.getBiggestVolume(geometricBody) +
                "\t\t Volume of this figure is " +
                GeometricBodyController.getBiggestVolume(geometricBody).getVolume());
        System.out.println("Figure with biggest area: " + GeometricBodyController.getBiggestArea(geometricBody) +
                "\t\t Area of this figure is " +
                GeometricBodyController.getBiggestArea(geometricBody).getSurface());
        for (GeometricBody figure: geometricBody){
            figure.print();
        }
    }
}
