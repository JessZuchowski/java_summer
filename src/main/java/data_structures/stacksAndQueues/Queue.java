package data_structures.stacksAndQueues;

import java.util.NoSuchElementException;

//https://introcs.cs.princeton.edu/java/43stack/Queue.java.html

//FIFO - first-in-first-out
public abstract class Queue<Item> implements Iterable<Item>{
    //declare number of elements, beginning, and end of queue
    public int n;
    public SQNode front;
    public SQNode back;

    //initialize empty queue
    public Queue() {
        front = null;
        back = null;
        n = 0;
    }

    //return true if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    //return size of queue
    public int size() {
        return n;
    }

    //PEEK METHOD
    public Item peek() {
        //if queue is empty, throw exception
        if (isEmpty()) throw new NoSuchElementException("underflow");
        //return item least recently added to queue
        return (Item) front.item;
    }

    //ENQUEUE METHOD
    //add item to queue
    public void enqueue(Item item) {
        //new node at back of queue
        SQNode formerBack = back;
        back = new SQNode();
        back.item = item;
        //back is the end, next is null
        back.next = null;
        //if queue is empty, front and back are the same
        if (isEmpty()) front = back;
        //else next in queue after previous back is current back
        else formerBack.next = back;
        //increment number of elements
        n++;
    }

    //DEQUEUE METHOD
    //remove least recently added item from queue
    public Item dequeue() {
        //if queue is empty, throw exception
        if (isEmpty()) throw new NoSuchElementException("underflow");
        //save item to return
        Item item = (Item) front.item;
        //delete front node
        front = front.next;
        //decrement queue size
        n--;
        //if queue is empty, back is null
        if (isEmpty()) back = null;
        //return saved item (least recently added)
        return item;
    }
}
