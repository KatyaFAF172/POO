package Queue2;

public class Queue {

    private int size;
    private Node front, back;

    /**Node Structure*/
    private class Node {
        private Object item;
        private Node next;

        public Node(Object item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    /**Constructor*/
    public Queue() {
        front = back = null;
        size = 0;
    }

    /**
     * Adds and item to the queue.
     *
     * @param item The item to add to the queue.
     */
    public void enqueue(Object item) {
        if(front == null) {
            front = back = new Node(item, null);
        } else {
            back.next = new Node(item, null);
            back = back.next;
        }
        ++size;
    }

    /**
     * Removes and item from the queue.
     *
     * @return The item removed from the queue, null if queue is emptry.
     */
    public Object dequeue() {
        Node dequeue;
        if(front == null) {
            return null;
        }
        --size;
        if(front == back) {
            dequeue = front;
            front = back = null;
            return dequeue.item;
        }
        dequeue = front;
        front = front.next;
        return dequeue.item;
    }

    /**
     * Returns the front item in the queue but does not remove it.
     *
     * @return The front item in the queue, null if queue is empty.
     */
    public Object front() {
        if(front == null) {
            return null;
        }
        return front.item;
    }

    /**returns true if queue is empty*/
    public boolean isEmpty(){

        return size() == 0;
    }


    public boolean isFull(){
        return size() == size;
    }


    /**
     * @return The size of the queue
     */
    public int size() {
        return size;
    }
}