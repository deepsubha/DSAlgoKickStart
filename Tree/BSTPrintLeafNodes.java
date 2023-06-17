/*
 * Tree: 
 *              50
             /     \
            30      70
           /  \    /  \
         20   40  60   80
 * 1. All Leaf Nodes
 * 2. All Non Leaf Nodes
 * 3. Delete a Node
 */
public class BSTPrintLeafNodes {
    public static void main(String[] args) {
        BSTOpertions.Node root = null;
        // int[] nodes = new int[]{50,30,40,20,70,60,80};
        int[] nodes = new int[]{50,30,20,70,60,75,55,62};
        BSTPrintLeafNodes ops = new BSTPrintLeafNodes();
        root = ops.createTree(nodes);

        /*------------------------------------------------ */
        /*1. All Leaf Nodes */
        ops.printLeafNodes(root);
        System.out.println();
        /*1. All Non Leaf Nodes */
        ops.printNonLeafNodes(root);
        System.out.println();
        /**Delete a Node (3 conditions. i. Leaf Node ii. single child iii. has both the childrens ) */
        root = ops.deleteNode(root, key);
    }
    /*create BST */
    private BSTOpertions.Node createTree (int[] nodes) {
        BSTOpertions.Node root = null;
        BSTOpertions operations = new BSTOpertions();
        /*1. insert nodes */
        for(int node: nodes) {
            root = operations.insertNode(root, node);
        }
        return root;
    }
    /*Print all the Leaf Nodes */
    private void printLeafNodes (BSTOpertions.Node root) {
        BSTOpertions.Node current = root;
        if(current != null){
            if(current.left == null && current.right == null) {
                System.out.print(current.key + " ");
                return;
            }
        }
        if(current != null) {
            printLeafNodes(current.left);
            printLeafNodes(current.right);
        }
        
    }

    /*Print all the Non Leaf Nodes */
    private void printNonLeafNodes (BSTOpertions.Node root) {
        BSTOpertions.Node current = root;
        if(current == null || (current.left == null && current.right == null) ) return;

        if(current.left != null || current.right != null) {
            System.out.print(current.key + " ");
        }
        if(current != null) {
            printNonLeafNodes(current.left);
            printNonLeafNodes(current.right);
        }
        
    }
}
