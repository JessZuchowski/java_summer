package data_structures.hashTable;

//https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/

import java.util.ArrayList;

public class HashTable<Key, Value> {
    //bucket to store array list
    private ArrayList<HashNode<Key, Value>> bucketAL;
    //capacity of array list
    private int bucketNumber;
    //size of array list
    private int size;

    //constructor
    public HashTable() {
        //initialize empty array list, capacity, and size
        bucketAL = new ArrayList<>();
        bucketNumber = 17;
        size = 0;

        //create empty list
        for (int i = 0; i < bucketNumber; i++)
            bucketAL.add(null);
    }

    //return size of array list
    public int size() {
        return size;
    }

    //return true if list is empty
    public boolean isEmpty() {
        return size() == 0;
    }

    //hash function to find index of a key
    private int getIndex(Key key) {
        int hashCode = key.hashCode();
        int index = hashCode % bucketNumber;
        return index;
    }

    //REMOVE KEY METHOD
    public Value removeKey(Key key) {
        //use hash function to find index for key
        int index = getIndex(key);

        //get head of list
        HashNode<Key, Value> head = bucketAL.get(index);

        //search for key in list
        HashNode<Key, Value> previous = null;
        while (head != null) {
            //if key is found
            if (head.key.equals(key))
                break;

            //else keep moving in list
            previous = head;
            head = head.next;
        }

        //if key not found
        if (head == null)
            return null;

        //decrement size
        size--;

        //remove key
        if (previous != null)
            previous.next = head.next;
        else
            bucketAL.set(index, head.next);

        return head.value;
    }

    //RETURN VALUE METHOD
    //returns value for a key
    public Value getValue(Key key) {
        //find head of list for key
        int index = getIndex(key);
        HashNode<Key, Value> head = bucketAL.get(index);

        //search key in list
        while (head != null) {
            if (head.key.equals(key))
                return head.value;
            head = head.next;
        }

        //if key not found
        return null;
    }

    //ADD KEY VALUE PAIR METHOD
    public void addKeyValuePair(Key key, Value value) {
        //find head of chain for key
        int index = getIndex(key);
        HashNode<Key, Value> head = bucketAL.get(index);

        //check if key exists
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        //insert key in list
        size++;
        head = bucketAL.get(index);
        HashNode<Key, Value> newNode = new HashNode<>(key, value);
        newNode.next = head;
        bucketAL.set(index, newNode);

        //if adding more K/V pairs than capacity, double table with temp bucket
        if ((1.0 * size) / bucketNumber >= 0.7) {
            //initialize temporary array list
            ArrayList<HashNode<Key, Value>> temp = bucketAL;
            bucketAL = new ArrayList<>();
            //double capacity
            bucketNumber = 2 * bucketNumber;
            size = 0;
            //create empty list
            for (int i = 0; i < bucketNumber; i++)
                bucketAL.add(null);

            //for each head node in temp bucket
            for (HashNode<Key, Value> headNode : temp) {

                while (headNode != null) {
                    //add key and value to node
                    addKeyValuePair(headNode.key, headNode.value);
                    //move to next node
                    headNode = headNode.next;
                }
            }
        }
    }
}