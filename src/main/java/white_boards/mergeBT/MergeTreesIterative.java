package white_boards.mergeBT;

import java.util.Stack;

public class MergeTreesIterative {

    public TreeNode mergeTrees(TreeNode n1, TreeNode n2) {
        if (n1 == null)
            return n2;
        //create a stack and add nodes of both trees
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{n1, n2});
        //remove node pairs from top of stack
        while (!stack.isEmpty()) {
            TreeNode[] n = stack.pop();
            if (n[0] == null || n[1] == null) {
                continue;
            }
            //add values of each pair and update node value of first tree
            n[0].value += n[1].value;
            //if left child of tree 1 doesn't exist,
            if (n[0].left == null) {
                //append left child of tree 2 to current node of tree 1
                n[0].left = n[1].left;
            //if left child of tree 1 exists, push left pair onto stack
            } else {
                stack.push(new TreeNode[]{n[0].left, n[1].left});
            }
            //if right child of tree 1 doesn't exist,
            if (n[0].right == null) {
                //append right child of tree 2 to current node of tree 1
                n[0].right = n[1].right;
                //if right child of tree 1 exists, push right pair onto stack
            } else {
                stack.push(new TreeNode[]{n[0].right, n[1].right});
            }
        }
        return n1;
    }
}
