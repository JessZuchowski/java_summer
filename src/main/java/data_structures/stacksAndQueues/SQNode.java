package data_structures.stacksAndQueues;

import java.util.Iterator;

public class SQNode<Item> implements Iterable<Item>{
    //item in node and reference to next item
    public Item item;
    public SQNode next;

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
