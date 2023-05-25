/*
 * @description This is a class for different Circular Singly Linked List operations - add,display,delete,update etc
 * Note: The head/ root will define the starting node of a circular LL and the last node will linked to the first node again i.e. last.next = first
 * Createdby      CreatedDate       Version
 * Subhadeep      26May2023         <first>
 */
class CircularSinglyLL{
    public static void main(String[] args) {
        Node root = null;
        CircularSinglyLL operations = new CircularSinglyLL();
        /*1. adding node in a circular single linked list */
        root = operations.addNode(root, 10);
        root = operations.addNode(root, 40);
        root = operations.addNode(root, 70);
        root = operations.addNode(root, 20);
        /*2.Display the CLL */
        root = operations.displayCLL(root);

    }

    /*
     * @description This is to add a new node in a circular singly linked list
     * @param root - (Node)the head of the linked list
     * @param data - (int)defines Node value
     * @return - (Node) head of the Node
     */
    private Node addNode(Node root, int data) {
        try{
            if(root == null) {
                Node newNode = new Node(data);
                //root = newNode;
                newNode.next = newNode;
                return newNode;
            }
            Node head = root;
            while (head.next != root) {
                head = head.next;
            }
            head.next = new Node(data);
            head.next.next = root;
        }
        catch(NullPointerException ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("CircularSinglyLL", "addNode");
            err.doLog(ex.getMessage());
        }catch(Exception ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("CircularSinglyLL", "addNode");
            err.doLog();
        }
        return root;
    } 

    /*
     * @description This is to display the Circular Singly Linked List
     * @param root - (Node)the head of the linked list
     * @return - (Node) head of the Node
     */
    private Node displayCLL(Node root) {
        try{
            Node head = root;
        while(head.next != root) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println(head.data); // This is print the last node value unlike SLL we have head.next != root as a termination condition
        }catch(NullPointerException ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("CircularSinglyLL", "displayList");
            err.doLog(ex.getMessage());
        }catch(Exception ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("CircularSinglyLL", "displayList");
            err.doLog();
        }
        return root;
    }

    /*This represent each node of a circular linked list */
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
}
