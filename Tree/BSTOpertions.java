/*
 * Quiclk Notes:
 * A Binary Search Tree (BST) is a special type of binary tree in which the left child of a node has a value less than the node’s value and 
 * the right child has a value greater than the node’s value. it makes it possible to efficiently search, insert, and delete elements in the tree.
 * The root of a BST is the node that has the largest value in the left subtree and the smallest value in the right subtree. Each left subtree is 
 * a BST with nodes that have smaller values than the root and each right subtree is a BST with nodes that have larger values than the root.
 */
/*
 * @description: Binary Search Tree and different basic operations - add,display,delete,update nodes etc.
 * Note: The head/ root will define the starting node of a circular LL and the last node will linked to the first node again i.e. last.next = first
 * Createdby      CreatedDate       Version
 * Subhadeep      10June2023         W-BST and Basic Operations
 */

public class BSTOpertions {
    public static void main(String[] args) {
        /* Let us create following BST
                50
             /     \
            30      70
           /  \    /  \
         20   40  60   80
        */
        Node root = null;
        BSTOpertions operations = new BSTOpertions();
        /*1. insert nodes */
        root = operations.insertNode(root, 50);
        root = operations.insertNode(root, 30);
        root = operations.insertNode(root, 40);
        root = operations.insertNode(root, 20);
        root = operations.insertNode(root, 70);
        root = operations.insertNode(root, 60);
        root = operations.insertNode(root, 80);
        System.out.println("root - "+root.key);
        /*2.inorder traversal */

    }
    /*Insert Operation in BST each node */
    public Node insertNode (Node node, int key) {
        if(node == null){ Node singleNode = new Node(key); return singleNode; }
        if(node.key >  key) node.left = insertNode(node.left, key);
        else if(node.key < key) node.right = insertNode(node.right, key);
        return node;
    }

    /*Node class to create each node in a BST */
    public class Node {
        int key;
        Node left, right;
        Node (int data) {
            this.key = data;
            this.left = this.right = null;
        }
    }    
}
