package white_boards.uniValueTree;

import java.util.ArrayList;
import java.util.List;

/*
Complexity:
Time: O(n) : n is # of nodes
Space: O(n) : # of nodes
* */

public class UniTreeDepthFirst {
    public class UniTree {
        //declare list of values
        List<Integer> values;
        //take in root node
        public boolean isUni(TreeNode root) {
            //create new list, search from root
            values = new ArrayList<>();
            search(root);
            //for each value in list,
            for (int val : values)
                //if value does not equal that at start of list
                if (val != values.get(0))
                    //return false
                    return false;
                //otherwise return true
            return true;
        }
        //search method
        //take in node
        public void search(TreeNode node) {
            //if node exists, add value to list
            if (node != null) {
                values.add(node.value);
                //search left and right subtrees
                search(node.left);
                search(node.right);
            }
        }
    }
}
