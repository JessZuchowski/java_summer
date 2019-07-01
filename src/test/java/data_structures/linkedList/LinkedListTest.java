package data_structures.linkedList;

import org.junit.Test;

import static data_structures.linkedList.LinkedList.printList;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testConstructor() {
        LinkedList test = new LinkedList();
        assertEquals(null, test.head);
    }

    @Test
    public void testInsert() {
        LinkedList test = new LinkedList();
        test.insert(test, 5);
        assertEquals(5, test.head.value);
        assertEquals(null, test.head.next);

        test.insert(test, 7);
        assertEquals(5, test.head.value);
        assertEquals(7, test.head.next.value);
        assertEquals(null, test.head.next.next);

        test.insert(test, 9);
        assertEquals(5, test.head.value);
        assertEquals(7, test.head.next.value);
        assertEquals(9, test.head.next.next.value);
    }

    @Test
    public void testIncludes() {
        LinkedList test = new LinkedList();
        test.insert(test, 5);
        test.insert(test, 7);
        test.insert(test, 9);

        assertTrue(test.includes(5));
        assertFalse(test.includes(11));
    }

    @Test
    public void testDeleteKey() {
        LinkedList test = new LinkedList();
        test.insert(test, 1);
        test.insert(test, 3);
        test.insert(test, 5);

        test.deleteKey(test, 1);
        assertEquals(3, test.head.value);
        assertEquals(5, test.head.next.value);

        test.insert(test, 7);
        test.deleteKey(test, 5);
        assertEquals(3, test.head.value);
        assertEquals(7, test.head.next.value);
    }

    @Test
    public void testDeletePosition() {
        LinkedList test = new LinkedList();
        test.insert(test, 7);
        test.insert(test, 9);
        test.insert(test, 11);
        test.insert(test, 13);

        test.deletePosition(test, 0);
        assertEquals(9, test.head.value);
        assertEquals(11, test.head.next.value);

        test.deletePosition(test, 1);
        assertEquals(9, test.head.value);
        assertEquals(13, test.head.next.value);
    }
}