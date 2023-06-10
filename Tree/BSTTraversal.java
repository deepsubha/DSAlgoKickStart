/*
 * Tree: 
 *              50
             /     \
            30      70
           /  \    /  \
         20   40  60   80
 * 
 */
public class BSTTraversal {
    public static void main(String[] args) {
        BSTOpertions.Node root = null;
        int[] nodes = new int[]{50,30,40,20,70,60,80};
        BSTTraversal ops = new BSTTraversal();
        root = ops.createTree(nodes);
        
        /*------------------------------------------------ */
        /*1. In order Traversal */
        ops.inOrder(root);
        System.out.println();

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

    /*In order Traversal */
    private void inOrder(BSTOpertions.Node root) {
        BSTOpertions.Node start = root;
        if(start != null) {
            inOrder(start.left);
            System.out.print(start.key+" ");
            inOrder(start.right);
        }
    }
}
