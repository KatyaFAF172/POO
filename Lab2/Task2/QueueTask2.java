
package lab2task2;

import java.util.PriorityQueue;

public class QueueTask2 {
    public static void main(String[] args){
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        /** Adding new elements to the Queue*/
        q.add(1);
        q.add(2);
        q.add(3);
        q.offer(50);

        System.out.println("q :" +q);

        /**Check is a Queue is empty */
        System.out.println("Is Queue empty?: " +q.isEmpty());

        /**Find the size of the Queue */
        System.out.println("Sze of Queue: " + q.size());


        for (int element : q)
            System.out.println(element);
            q.remove(3);
            System.out.println("After removing: ");
            for (int element: q)
                System.out.println(element);

        //while (!q.isEmpty()){
           //System.out.println(q.remove());
       //}
    }
}
