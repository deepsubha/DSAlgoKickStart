/*
 * @description This is a class for different Single Linked List operations - add,display,delete,update etc
 * Createdby      CreatedDate       Version
 * Subhadeep      24May2023         <first>
 */
class SingleLinkedList{
    /*
     * @description This is the main method to run the different operations in a single linked list
     */
    public static void main(String[] args) {
        Node root = null;
        SingleLinkedList operations = new SingleLinkedList();
        /*1.Display with empty linked list */
        root = operations.displayList(root);
        /*2.Add new Nodes */
        root = operations.addNode(root, 50);
        root = operations.addNode(root, 14);
        root = operations.addNode(root, 34);
        root = operations.addNode(root, 56);
        /*3.Display linked list */
        root = operations.displayList(root);
        /*4.Delete a node */
        root = operations.deleteNode(root, 14);
        root = operations.displayList(root);
        root = operations.deleteNode(root, 142);
        root = operations.displayList(root);
        /*5.update a node data with given data */
        root = operations.updateNode(root, 56, 65);
        root = operations.displayList(root);
        root = operations.updateNode(root, 56534, 65);
        root = operations.displayList(root);
    }
    /*-------------------------------------main class end here-------------------------------- */

    /*
     * @description This is to add a new node in a single linked list
     * @param root - (Node)the head of the linked list
     * @param data - (int)defines Node value
     * @return - (Node) head of the Node
     */
    private Node addNode(Node root, int data) {
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
        }catch(NullPointerException ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("SingleLinkedList", "addNode");
            err.doLog(ex.getMessage());
        }catch(Exception ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("SingleLinkedList", "addNode");
            err.doLog();
        }
        return root;
    }

    /*
     * @description This is to add a new node in a single linked list
     * @param root - (Node)the head of the linked list
     * @param data - (int)defines Node value
     * @return - (Node) head of the Node
     */
    private Node deleteNode(Node root, int data) {
        try{
            if(root == null) {
                System.out.println(ErrorLogsUtility.EMPTY_LIST);
                return root;
            }
            Node head = root;
            Node lastNode = null;
            while(head != null) {
                if(head.data == data) {
                    lastNode.next = head.next;
                    break;
                }
                lastNode = head;
                head = head.next;
            }
            if(head == null) { System.out.println(ErrorLogsUtility.NOT_FOUND); }
        }catch(NullPointerException ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("SingleLinkedList", "deleteNode");
            err.doLog(ex.getMessage());
        }catch(Exception ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("SingleLinkedList", "deleteNode");
            err.doLog();
        }
        return root;
    }

    /*
     * @description This is to add a new node in a single linked list
     * @param root - (Node)the head of the linked list
     * @param data - (int)defines Node value
     * @return - (Node) head of the Node
     */
    private Node updateNode(Node root, int oldData, int newData) {
        try{
            if(root == null) {
                System.out.println(ErrorLogsUtility.EMPTY_LIST);
                return root;
            }
            Node head = root;
            while(head != null) {
                if(head.data == oldData) {
                    head.data = newData;
                    break;
                }
                head = head.next;
            }
            if(head == null) { System.out.println(ErrorLogsUtility.NOT_FOUND); }
        }catch(NullPointerException ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("SingleLinkedList", "updateNode");
            err.doLog(ex.getMessage());
        }catch(Exception ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("SingleLinkedList", "updateNode");
            err.doLog();
        }
        return root;
    }

    /*
     * @description This is to display the Single Linked List
     * @param root - (Node)the head of the linked list
     * @return - (Node) head of the Node
     */
    private Node displayList(Node root) {
        try{
            Node head = root;
            if(root == null) {
                System.out.println(ErrorLogsUtility.EMPTY_LIST);
            }
            while(head != null) {
                System.out.print(head.data+" ");
                head = head.next;
            }
            System.out.println();
        }catch(NullPointerException ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("SingleLinkedList", "displayList");
            err.doLog(ex.getMessage());
        }catch(Exception ex) {
            ErrorLogsUtility err = new ErrorLogsUtility("SingleLinkedList", "displayList");
            err.doLog();
        }
        return root;
    }
 
}