package com.github.karmazyn.tree;

/**
 * Created by m.karmazyn on 06/07/15.
 */
public class TreePrinter {

    public String print(TreeNode node) {
        if (node == null) {
            return null;
        }
        StringBuilder builder = printToStringBuilder(node);
        return builder.delete(builder.length() - 1, builder.length()).toString();
    }

    private StringBuilder printToStringBuilder(TreeNode node) {
        if (node == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder left = printToStringBuilder(node.left);
        if (left != null) {
            sb.append(left);
        }
        sb.append(node.val).append(" ");
        StringBuilder right = printToStringBuilder(node.right);
        if (right != null) {
            sb.append(right);
        }
        return sb;
    }
}
