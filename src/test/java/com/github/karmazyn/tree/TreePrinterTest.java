package com.github.karmazyn.tree;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Created by m.karmazyn on 06/07/15.
 */
public class TreePrinterTest {

    private TreePrinter treePrinter = new TreePrinter();

    @Test
    public void shouldReturnNull() {
        assertThat(treePrinter.print(null)).isNull();
    }

    @Test
    public void shouldReturnRootValue() {
        assertThat(treePrinter.print(new TreeNode(0))).isEqualTo("0");
    }

    @Test
    public void shouldReturnTreeInOrder() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        assertThat(treePrinter.print(root)).isEqualTo("1 2 4");
    }

}