package Lecture37_Mar18_TreeTraversals;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int value) {
        val = value;
        left = right = null;
    }
}

public class AllTraversals {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Preorder Traversal:");
        preorder(root);
        System.out.println();

        System.out.println("Inorder Traversal:");
        inorder(root);
        System.out.println();

        System.out.println("Postorder Traversal:");
        postorder(root);
        System.out.println();

        System.out.println("Level Order Traversal:");
        levelOrder(root);
    }

    public static void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    public static void postorder(TreeNode node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val + " ");
    }

    public static void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }
}
