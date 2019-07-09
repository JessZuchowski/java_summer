package data_structures.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void testAdd() {
        BinarySearchTree test = new BinarySearchTree();

        test.add(3);
        assertEquals(3, test.root.value);

        test.add(1);
        assertEquals(1, test.root.left.value);

        test.add(5);
        assertEquals(5, test.root.right.value);
    }

    @Test
    public void testIsEmpty() {
        BinarySearchTree test = new BinarySearchTree();
        assertTrue(test.isEmpty());

        test.add(1);
        assertFalse(test.isEmpty());
    }

    @Test
    public void testGetSize() {
        BinarySearchTree test = new BinarySearchTree();

        assertEquals(0, test.getSize());

        test.add(7);
        assertEquals(1, test.getSize());
    }

    @Test
    public void testContains() {
        BinarySearchTree test = new BinarySearchTree();

        test.add(3);
        test.add(5);

        assertTrue(test.contains(3));
        assertTrue(test.contains(5));

        assertFalse(test.contains(2));
        assertFalse(test.contains(4));
    }

    @Test
    public void testDelete() {
        BinarySearchTree test = new BinarySearchTree();

        test.add(3);
        test.add(5);
        test.add(7);

        assertTrue(test.contains(5));

        test.delete(5);
        assertFalse(test.contains(5));
    }

    @Test
    public void testPreOrderTraversal() {
        BinarySearchTree test = new BinarySearchTree();

        test.add(5);
        test.add(7);
        test.add(9);
        test.add(4);
        test.add(6);
        test.add(8);

        test.preOrderTraversal(test.root);
    }

    @Test
    public void testPostOrderTraversal() {
        BinarySearchTree test = new BinarySearchTree();

        test.add(5);
        test.add(7);
        test.add(9);
        test.add(4);
        test.add(6);
        test.add(8);

        test.postOrderTraversal(test.root);
    }

    @Test
    public void testInOrderTraversal() {
        BinarySearchTree test = new BinarySearchTree();

        test.add(5);
        test.add(7);
        test.add(9);
        test.add(4);
        test.add(6);
        test.add(8);

        test.inOrderTraversal(test.root);
    }

    @Test
    public void testBreadthFirstTraversal() {
        BinarySearchTree test = new BinarySearchTree();

        test.add(5);
        test.add(7);
        test.add(9);
        test.add(4);
        test.add(6);
        test.add(8);

        test.breadthFirstTraversal();
    }
}