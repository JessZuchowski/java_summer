package data_structures.linkedList;

// https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/

public class LinkedList {

    public ListNode head;

    public LinkedList() {
        this.head = null;
    }

    // INSERTION METHOD
    public static LinkedList insert(LinkedList list, int value) {

        //create new node
        ListNode newNode = new ListNode(value);
        newNode.next = null;

        // if list is empty, make new node the head
        if (list.head == null) {
            list.head = newNode;
        }
        // else traverse until end and insert new node
        else {
            ListNode end = list.head;
            while (end.next != null) {
                end = end.next;
            }
            // insert new node at end
            end.next = newNode;
        }
        return list;
    }

    // TRAVERSAL
    public static void printList(LinkedList list) {
        ListNode current = list.head;

        System.out.println("LL: ");

        //traverse list
        while (current != null) {
            //print value of current node
            System.out.println(current.value + " ");

            //go to next node
            current = current.next;
        }
        System.out.println();
    }

    // INCLUDES METHOD
    //take in a value and return boolean whether or not it exists in the list
    public boolean includes(int value) {

        if (this.head == null) {
            return false;
        }

        //store head node
        ListNode current = this.head;

        while (current != null) {
            // return true if value is in current
            if (current.value == value) {
                return true;
            }
            else {
                //change current
                current = current.next;
            }
        }
        return false;
    }

    // DELETION METHODS
    // delete by key method
    public static LinkedList deleteKey(LinkedList list, int key) {
        // store head node
        ListNode current = list.head,
                previous = null;

        //if key is in head
        if (current != null && current.value == key) {
            //changed head
            list.head = current.next;

            return list;
        }

        //if key is in another node: search list for key, keep track of previous node
        while (current != null && current.value != key) {
            //continue to next node
            previous = current;
            current = current.next;
        }
        // if key is in current
        if (current != null) {
            //unlink
            previous.next = current.next;
        }

        // if key is not in list
        if (current == null) {

        }

        return list;
    }

    //delete by position method
    public static LinkedList deletePosition(LinkedList list, int index) {
        //store head
        ListNode current = list.head,
                previous = null;

        //if index is 0, head is deleted
        if (index == 0 && current != null) {
            //changed head
            list.head = current.next;

            return list;
        }

        //if index is between 0 and size of list, use counter
        int counter = 0;

        // count for index, keep track of current  node
        while (current != null) {

            if (counter == index) {
                //current is index, unlink
                previous.next = current.next;

                break;
            }
            //if current is not index, continue to next node
            else {
                previous = current;
                current = current.next;
                counter ++;
            }

        }
            //if index is greater than size of list
            if (current == null) {

            }
            return list;
    }
}
