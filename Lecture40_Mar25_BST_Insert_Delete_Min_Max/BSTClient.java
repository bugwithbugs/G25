package Lecture40_Mar25_BST_Insert_Delete_Min_Max;

public class BSTClient {
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

        bst.printInOrder();

        System.out.println("Search for 10: " + bst.search(10));
        System.out.println("Search for 15: " + bst.search(15));
        System.out.println("Max Node: " + bst.findMax());
        System.out.println("Min Node: " + bst.findMin());
    }
}
