package white_boards.rangeSumBST;


/*
https://leetcode.com/problems/range-sum-of-bst/
Given the root node of a BST, return the sum of the values of all nodes with values between given left and right.

Depth-first search

Complexity:
Time: O(n) : n = number of nodes
Space: O(h) ; h = height of tree

* */
public class RangeSumBSTRecursive {
    //declare int answer
    int answer;

    //take in root, left, and right values
    public int sumBST(TreeNode root, int left, int right) {
        //set answer to 0, search tree, return answer
        answer = 0;
        search(root, left, right);
        return answer;
    }

    public void search(TreeNode node, int left, int right) {
        if (node != null) {
            //base case: values are between (inclusive) left and right
            if (left <= node.value && right >= node.value)
                //answer is sum of values
                answer += node.value;
            //left search
            if (left < node.value)
                search(node.left, left, right);
            //right search
            if (right > node.value)
                search(node.right, left, right);
        }
    }
}
