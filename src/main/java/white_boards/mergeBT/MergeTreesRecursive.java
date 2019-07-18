package white_boards.mergeBT;

/*
 https://leetcode.com/problems/merge-two-binary-trees/

 Complexity:
 Time: O(m) : m = minimum # of nodes
 Space: O(m) : m = depth of trees
* */

public class MergeTreesRecursive {

    public TreeNode mergeTrees(TreeNode n1, TreeNode n2) {
        //if node of one tree is null, return node of the other
        if (n1 == null)
            return n2;
        if (n2 == null)
            return n1;
        //value of node 1 will be added value of node 2
        n1.value += n2.value;
        //node 1 left is merged value of node 1 & 2 left
        n1.left = mergeTrees(n1.left, n2.left);
        //node 1 right is merged value of node 1 & 2 right
        n1.right = mergeTrees(n1.right, n2.right);
        return n1;
    }
}
