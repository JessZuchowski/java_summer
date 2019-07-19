package white_boards.linkedListReversal;

/*
https://leetcode.com/problems/reverse-linked-list/

Complexity:
Time: O(n) : n is length of list
Space: O(1)
* */

public class ListReversalIterative {

    //take in head node
    public Node reverseList(Node head) {
        //set previous to null, current to the head
        Node previous = null;
        Node current = head;
        //while traversing, change current node's pointer to previous instead of next
        while (current != null) {
            //set temporary next to current node's next
            Node nextTemp = current.next;
            //set current's next to previous
            current.next = previous;
            //set previous to current
            previous = current;
            //set current to temporary next
            current = nextTemp;
        }
        return previous;
    }
}
