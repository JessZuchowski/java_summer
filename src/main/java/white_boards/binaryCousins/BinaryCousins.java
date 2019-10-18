package white_boards.binaryCousins;


import white_boards.mergeBT.TreeNode;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/cousins-in-binary-tree/

Given the root of a binary tree with unique values
and values x & y of two nodes,
return true if given nodes are cousins.
* */
public class BinaryCousins {
    //record node parent and depth in hashmaps
    Map<Integer, Integer> depth;
    Map<Integer, TreeNode> parent;

    public boolean areCousins(TreeNode root, int x, int y) {
        depth = new HashMap<>();
        parent = new HashMap<>();
        dfs(root, null);
        //return true if x & y are at the same depth and have different parents
        return (depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y));
    }

    //depth first search
    public void dfs(TreeNode node, TreeNode parentNode) {
        if (node != null) {
            depth.put(node.value, parentNode != null ? 1 + depth.get(parentNode.value) :0);
            parent.put(node.value, parentNode);
            dfs(node.left, node);
            dfs(node.right, node);
        }
    }
}
