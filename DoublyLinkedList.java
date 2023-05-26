/*
 * @description This is a class for different Doubly Linked List operations - add,display,delete,update etc
 * Createdby      CreatedDate       Version
 * Subhadeep      25May2023         <first>
 */
public class DoublyLinkedList {
    /*
     * @description This is the main method to run the different operations in a doubly linked list
     */
    public static void main(String[] args) {
        Node root = null;
        DoublyLinkedList operations = new DoublyLinkedList();
        /*check for empty Doubly Linked List */
        root = operations.displayForwardDLL(root);
        /*1. Create a DLL */
        root = operations.addNode(root, 10);
        root = operations.addNode(root, 80);
        root = operations.addNode(root, 30);
        root = operations.addNode(root, 20);
        root = operations.addNode(root, 40);
        root = operations.addNode(root, 60);
        root = operations.addNode(root, 90);
        /*2. Display a DLL(traverse forward) */
        root = operations.displayForwardDLL(root);
        /*3. Display a DLL(traverse backward) */
        root = operations.displayBackwardDLL(root);
        /*4. Delete a node */
        root = operations.deleteNodeByValue(root, 20);
        root = operations.displayForwardDLL(root);
        root = operations.displayBackwardDLL(root);
        /*Update - check Single Linked list concept is same */
    }

    /*
     * @description This is to add a new node in a doubly linked list
     * @param root - (Node)the head of the linked list
     * @param data - (int)defines new Node value
     * @return - (Node) head of the Node
     */
    private Node addNode (Node root, int data) {
        try{
            Node newNode = new Node(data);
            if(root == null) {
                return newNode;
            }
            Node head = root;
            Node lastNode = null;
            while(head != null) {
                lastNode = head;
                head = head.next;
            }
            lastNode.next = newNode;
            newNode.prev = lastNode;
        }catch(NullPointerException ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("DoublyLinkedList", "addNode");
            err.doLog(ex.getMessage());
        }catch(Exception ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("DoublyLinkedList", "addNode");
            err.doLog();
        }
        return root;
    }

    /*
     * @description This is to add a new node in a doubly linked list
     * @param root - (Node)the head of the linked list
     * @param data - (int)defines Node value
     * @return - (Node) head of the Node
     */
    private Node deleteNodeByValue(Node root, int data) {
        try{
            if(root == null) {
                System.out.println(ErrorLogsUtility.EMPTY_LIST);
            }
            Node head = root;
            while(head != null) {
                if(head.data == data) break;
                head = head.next;
            }
            head.prev.next = head.next;
            head.next.prev = head.prev;
        }catch(NullPointerException ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("DoublyLinkedList", "deleteNodeByValue");
            err.doLog(ex.getMessage());
        }catch(Exception ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("DoublyLinkedList", "deleteNodeByValue");
            err.doLog();
        }
        return root;
    }

    /*
     * @description This is to display the Single Linked List (forward traverse)
     * @param root - (Node)the head of the linked list
     * @return - (Node) head of the Node
     */
    private Node displayForwardDLL(Node root) {
        try{
            if(root == null) {
                System.out.println(ErrorLogsUtility.EMPTY_LIST);
            }
            Node head = root;
            while(head != null) {
                System.out.print(head.data+" ");
                head = head.next;
            }
            System.out.println();
        }catch(NullPointerException ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("DoublyLinkedList", "displayForwardDLL");
            err.doLog(ex.getMessage());
        }catch(Exception ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("DoublyLinkedList", "displayForwardDLL");
            err.doLog();
        }
        return root;
    }
    
    /*
     * @description This is to display the Single Linked List (forward traverse)
     * @param root - (Node)the head of the linked list
     * @return - (Node) head of the Node
     */
    private Node displayBackwardDLL(Node root) {
        try{
            if(root == null) {
                System.out.println(ErrorLogsUtility.EMPTY_LIST);
            }
            Node head = root;
            Node lastNode = null;
            while(head != null) {
                lastNode = head;
                head = head.next;
            }
            while(lastNode != null) {
                System.out.print(lastNode.data+" ");
                lastNode = lastNode.prev;
            }
            System.out.println();
        }catch(NullPointerException ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("DoublyLinkedList", "displayBackwardDLL");
            err.doLog(ex.getMessage());
        }catch(Exception ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("DoublyLinkedList", "displayBackwardDLL");
            err.doLog();
        }
        return root;
    }

    /* Node - each node of the Doubly Linked List */
    private class Node {
        int data;
        Node prev;
        Node next;
        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}
