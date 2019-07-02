package data_structures.stacksAndQueues;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void isEmpty() {
       Stack test = new Stack() {
           @Override
           public Iterator iterator() {
               return null;
           }
       };
       assertEquals(null, test.top);
    }

    @Test
    public void size() {
        Stack test = new Stack() {
            @Override
            public Iterator iterator() {
                return null;
            }
        };
        assertEquals(0, test.size());
    }

    @Test
    public void peek() {
        Stack test = new Stack() {
            @Override
            public Iterator iterator() {
                return null;
            }
        };

        test.push(1);
        assertSame(1, test.peek());
    }

    @Test
    public void push() {
        Stack test = new Stack() {
            @Override
            public Iterator iterator() {
                return null;
            }
        };

        test.push(1);
        test.push(3);
        test.push(5);

        assertEquals(5, test.top.item);
        assertEquals(3, test.top.next.item);
        assertEquals(1, test.top.next.next.item);
    }

    @Test
    public void pop() {
        Stack test = new Stack() {
            @Override
            public Iterator iterator() {
                return null;
            }
        };

        test.push(5);
        test.push(7);
        test.push(9);
        test.pop();

        assertEquals(7, test.top.item);
        assertEquals(5, test.top.next.item);
    }
}