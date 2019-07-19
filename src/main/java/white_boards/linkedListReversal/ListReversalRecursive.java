package white_boards.linkedListReversal;

/*
Complexity:
Time: O(n) : n is length of list
Space: O(n) : recursive stack space, n is list's length
* */

public class ListReversalRecursive {

    //take in head node
    public Node reverseList(Node head) {
        //base case: 0 or 1 nodes in list, end of list reached
        if (head == null || head.next == null)
            return head;

        //set previous to reverse head.next
        Node previous = reverseList(head.next);
        //work backwards, reverse the front of the list
        head.next.next = head;
        head.next = null;
        return previous;
    }
}
