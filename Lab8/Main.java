package lab8;

public class Main {
    public static void main(String[] args) {

        Cub cub = new Cub(5);
        Sphere sphere = new Sphere(8);
        Parallelepiped parallelepiped = new Parallelepiped(10,7,4);
        GeometricBody[] geometricBody = {cub, sphere, parallelepiped};
        System.out.println(GeometricBodyController.getBiggestVolume(geometricBody));
        System.out.println(GeometricBodyController.getBiggestArea(geometricBody));
        cub.print();
        sphere.print();
        parallelepiped.print();
    }
}
