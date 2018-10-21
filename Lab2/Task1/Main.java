package lab2;

public class Main {
    public static void main(String args[]) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(2,3,4);

        box1.getArea();
        double box1Volume = box1.getVolume();
        System.out.println(box1Volume);
        double box1Area = box1.getArea();
        System.out.println(box1Area);


        System.out.println(box2.getVolume());
        System.out.println(box2.getArea());

        System.out.println(box3.getVolume());
        System.out.println(box3.getArea());


        box1.print();

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
    }
}
