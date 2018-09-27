package lab2;

public class Test {
    public static void main(String args[])
    {
        // create boxes using the various
        // constructors
        Box mybox = new Box(5, 10, 15);

        double vol;
        double ar;

        //get area of box
        ar = mybox.area();
        System.out.println("Area of box is " + ar);

        // get volume of box
        vol = mybox.volume();
        System.out.println(" Volume of box is " + vol);

    }
}
