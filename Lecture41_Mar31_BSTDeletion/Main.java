package Lecture41_Mar31_BSTDeletion;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BST {
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

    void delete(int val) {
        root = deleteNode(root, val);
    }

    Node deleteNode(Node node, int val) {
        if (node == null)
            return null;

        if (val < node.val) {
            node.left = deleteNode(node.left, val);
        } else if (val > node.val) {
            node.right = deleteNode(node.right, val);
        } else {
            if (node.left == null)
                return node.right;
            if (node.right == null)
                return node.left;

            Node successor = findMin(node.right);
            node.val = successor.val;
            node.right = deleteNode(node.right, successor.val);
        }
        return node;
    }

    Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    void printInOrder() {
        inOrderTraversal(root);
    }

    void inOrderTraversal(Node node) {
        if (node == null)
            return;
        inOrderTraversal(node.left);
        System.out.print(node.val + " ");
        inOrderTraversal(node.right);
    }
}

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(8);
        bst.insert(3);
        bst.insert(10);
        bst.insert(1);
        bst.insert(6);
        bst.insert(14);
        bst.insert(4);
        bst.insert(7);
        bst.insert(13);

        System.out.println("Inorder Traversal:");
        bst.printInOrder();

        System.out.println("\nDeleting 10...");
        bst.delete(10);

        System.out.println("Inorder Traversal after deletion:");
        bst.printInOrder();
    }
}
