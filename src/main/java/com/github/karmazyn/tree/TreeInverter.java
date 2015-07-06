package com.github.karmazyn.tree;

/**
 * Created by m.karmazyn on 06/07/15.
 */
public class TreeInverter {
    public void invert(TreeNode tree) {
        if(tree != null) {
            TreeNode tmp = tree.left;
            tree.left = tree.right;
            tree.right = tmp;
            invert(tree.left);
            invert(tree.right);
        }
    }
}
