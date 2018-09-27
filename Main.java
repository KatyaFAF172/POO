package Queue2;

public class Main {
    public static void main(String[] args){
        Queue theQueue = new Queue();

        /** queue holds 3 items */
        theQueue.enqueue(10);
        theQueue.enqueue(20);
        theQueue.enqueue(30);

        theQueue.dequeue();/**remove 10*/

        theQueue.enqueue(40);


        if( theQueue.isEmpty())    /**remove and display*/

            System.out.print("Queue is Empty");
            else
            System.out.print(" Queue is not Empty");

            if (theQueue.isFull())
                System.out.println("\n Queue is Full");
            else
                System.out.println("Queue is not Full");

        theQueue.isFull();
        System.out.println();
    }
}
