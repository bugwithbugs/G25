package Lecture40_Mar25_BST_Insert_Delete_Min_Max;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BST {
    Node root;

    void insert(int val) {
        root = insertNode(root, val);
    }

    Node insertNode(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }
        if (val < node.val) {
            node.left = insertNode(node.left, val);
        } else if (val > node.val) {
            node.right = insertNode(node.right, val);
        }
        return node;
    }

    boolean search(int val) {
        return searchNode(root, val);
    }

    boolean searchNode(Node node, int val) {
        if (node == null) {
            return false;
        }
        if (val == node.val) {
            return true;
        }
        if (val < node.val) {
            return searchNode(node.left, val);
        } else {
            return searchNode(node.right, val);
        }
    }

    int findMax() {
        return findMaxNode(root);
    }

    int findMaxNode(Node node) {
        if (node.right == null) {
            return node.val;
        }
        return findMaxNode(node.right);
    }

    int findMin() {
        return findMinNode(root);
    }

    int findMinNode(Node node) {
        if (node.left == null) {
            return node.val;
        }
        return findMinNode(node.left);
    }

    void printInOrder() {
        inOrderTraversal(root);
        System.out.println();
    }

    void inOrderTraversal(Node node) {
        if (node == null)
            return;
        inOrderTraversal(node.left);
        System.out.print(node.val + " ");
        inOrderTraversal(node.right);
    }
}
