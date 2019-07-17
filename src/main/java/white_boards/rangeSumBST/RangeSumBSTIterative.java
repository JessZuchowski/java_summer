package white_boards.rangeSumBST;

import java.util.Stack;

public class RangeSumBSTIterative {
    //take in root, left, and right int
    public int sumBST(TreeNode root, int left, int right) {
        //set answer to 0
        int answer = 0;
        //declare stack and add root
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            //remove node from stack
            TreeNode node = stack.pop();
            if (node != null) {
                //base case: node values are between (inclusive) left and right
                if (left <= node.value && right >= node.value)
                    //answer is sum of values
                    answer += node.value;
                //left search, add left nodes to stack
                if (left < node.value)
                    stack.push(node.left);
                //right search, add right nodes to stack
                if (right > node.value)
                    stack.push(node.right);
            }
        }
        return answer;
    }
}
