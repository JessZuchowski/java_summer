package white_boards.uniValueTree;

/*
https://leetcode.com/problems/univalued-binary-tree/

return boolean if a tree is uni-valued

Complexity:
Time: O(n) : n is # of nodes
Space: O(h) : h is height of tree

* */

public class UniTreeRecursive {
    //take in root node
    public boolean isUni(TreeNode root) {
        //left recursion
        //left is true if left child is null or root value equals left value
        boolean leftTrue = (root.left == null || (root.value == root.left.value && isUni(root.left)));
        //right recursion
        //right is true if right child is null or root value equals right value
        boolean rightTrue = (root.right == null || (root.value == root.right.value && isUni(root.right)));
        //return left and right true
        return leftTrue && rightTrue;
    }
}
