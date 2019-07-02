package data_structures.stacksAndQueues;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void testIsEmpty() {
        Queue test = new Queue() {
            @Override
            public Iterator iterator() {
                return null;
            }
        };
        assertEquals(null, test.front);
    }

    @Test
    public void testSize() {
        Queue test = new Queue() {
            @Override
            public Iterator iterator() {
                return null;
            }
        };
        assertEquals(0, test.size());
    }

    @Test
    public void testPeek() {
        Queue test = new Queue() {
            @Override
            public Iterator iterator() {
                return null;
            }
        };

        test.enqueue(1);
        assertSame(1, test.peek());
    }

    @Test
    public void testEnqueue() {
        Queue test = new Queue() {
            @Override
            public Iterator iterator() {
                return null;
            }
        };

        test.enqueue(1);
        test.enqueue(3);
        test.enqueue(5);

        assertEquals(1, test.front.item);
        assertEquals(3, test.front.next.item);
        assertEquals(5, test.front.next.next.item);
    }

    @Test
    public void testDequeue() {
        Queue test = new Queue() {
            @Override
            public Iterator iterator() {
                return null;
            }
        };

        test.enqueue(5);
        test.enqueue(7);
        test.enqueue(9);
        test.dequeue();

        assertEquals(7, test.front.item);
        assertEquals(9, test.front.next.item);
    }
}