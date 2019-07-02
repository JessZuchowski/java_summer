package data_structures.stacksAndQueues;

//https://introcs.cs.princeton.edu/java/43stack/Stack.java.html

import java.util.NoSuchElementException;

//LIFO - last-in-first-out
public abstract class Stack<Item> implements Iterable<Item> {
    //declare size and top of stack
    public int n;
    public SQNode top;

    //initialize empty stack
    public Stack() {
        top = null;
        n = 0;
    }

    //return true if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    //return size of stack
    public int size() {
        return n;
    }

    //PEEK METHOD
    public Item peek() {
        //if stack is empty, throw exception
        if (isEmpty()) throw new NoSuchElementException("underflow");
        //return item most recently added to stack
        return (Item) top.item;
    }

    //PUSH METHOD
    //add items to stack
    public void push(Item item) {
        //new node at top of stack
        SQNode formerTop = top;
        top = new SQNode();
        top.item = item;
        //next in stack is the former top
        top.next = formerTop;
        //increment number of elements
        n++;
    }

    //POP METHOD
    //remove most recently added item from stack
    public Item pop() {
        //if stack is empty, throw exception
        if (isEmpty()) throw new NoSuchElementException("underflow");
        //save item to return
        Item item = (Item) top.item;
        //delete top node
        top = top.next;
        //decrement stack size
        n--;
        //return saved item (most recently added)
        return item;
    }

}
