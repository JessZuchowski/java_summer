package data_structures.trees;

//https://www.baeldung.com/java-binary-tree

import data_structures.linkedList.LinkedList;
import data_structures.stacksAndQueues.Queue;

public class BinarySearchTree {

    public TreeNode root;

    //start recursion at root node
    public void add(int value) {

        root = insertRecursive(root, value);
    }

    //INSERTION METHOD
    private TreeNode insertRecursive(TreeNode current, int value) {
        //if current node is null, return value of new node
        if ( current == null) {
            return new TreeNode(value);
        }
        //if value is lass than current node,
        if (value < current.value) {
            //insert value into node left of current
            current.left = insertRecursive(current.left, value);
            // if value is greater than or equal to current node,
        } else if (value >= current.value) {
            //insert value into right of current node
            current.right = insertRecursive(current.right, value);
        }
        return current;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getSize() {
        return getSizeRecursive(root);
    }

    //GET SIZE METHOD
    private int getSizeRecursive(TreeNode current) {
        return current == null
                ? 0
                : getSizeRecursive(current.left) + getSizeRecursive(current.right) + 1;
    }

    //start at root node
    public boolean contains(int value) {
        return containsRecursive(root, value);
    }

    //CONTAINS METHOD
    public boolean containsRecursive (TreeNode current, int value) {
        //search for value by comparing to current node
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        //continue to left or right
        return value < current.value
                ? containsRecursive(current.left, value)
                : containsRecursive(current.right, value);
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    //DELETE METHOD
    public TreeNode deleteRecursive(TreeNode current, int value) {
        if (current == null) {
            return null;
        }
        if (value == current.value) {
            //case one, no children
            if (current.left == null && current.right == null) {
                return null;
            }
            //case two, one child
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            //case three, two children
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(TreeNode root) {
        return root.left == null
                ? root.value
                : findSmallestValue(root.left);
    }

    //TRAVERSAL METHODS
    public void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.println(node.value + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.value + " ");
        }
    }
}
