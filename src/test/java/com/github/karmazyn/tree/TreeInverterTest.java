package com.github.karmazyn.tree;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Created by m.karmazyn on 06/07/15.
 */
public class TreeInverterTest {

    private TreeInverter inverter = new TreeInverter();
    private TreePrinter treePrinter = new TreePrinter();

    @Test
    public void shouldKeepRootIntact() {
        TreeNode tree = new TreeNode(0);
        inverter.invert(tree);
        assertThat(treePrinter.print(tree)).isEqualTo("0");
    }

    @Test
    public void shouldInvertThreeWithSingleLevelNode() {
        TreeNode tree = new TreeNode(2);
        tree.left = new TreeNode(0);
        tree.right = new TreeNode(4);
        inverter.invert(tree);
        assertThat(treePrinter.print(tree)).isEqualTo("4 2 0");
    }

    @Test
    public void shouldInvertThreeWithTwoLevels() {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right = new TreeNode(3);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);

        inverter.invert(tree);
        assertThat(treePrinter.print(tree)).isEqualTo("7 3 6 1 5 2 4");
    }

    @Test
    public void shouldInvertUnbalancedTree() {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);

        inverter.invert(tree);
        assertThat(treePrinter.print(tree)).isEqualTo("1 5 2 4");
    }
}