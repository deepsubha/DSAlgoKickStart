/*
 * Tree: 
 *              50
             /     \
            30      70
           /  \    /  \
         20   40  60   80
 * 1. In Order - (Print the tree ascending order nodes)
 * 2. Pre Order - used to create a copy of the tree / also used to get prefix expression on of an expression tree(The expression tree is a binary tree in which each internal node corresponds to the operator and each leaf node corresponds to the operand)
 * 3. Post Order - left -> right -> root. used to delete the tree. visit the root of a subtree at last.
 * 4. Level Order - Level order traversal of a BST is `breadth first traversal` for the tree. It visits all nodes at a particular level first before moving to the next level.
 * e.g - [50, (30,70), (20,40,60,80)]
 * *--SUB PROBLEMS--*
 * 5. (** Height of a BST **)
 * 6. (** print nodes at a given level **)
 */
public class BSTTraversal {
    public static void main(String[] args) {
        BSTOpertions.Node root = null;
        int[] nodes = new int[]{50,30,40,20,70,60,80};
        BSTTraversal ops = new BSTTraversal();
        root = ops.createTree(nodes);
        
        /*------------------------------------------------ */
        /*1. In order Traversal */
        System.out.println("*In Order Traversal*");
        ops.inOrder(root);
        /*2. Pre Order Traversal */
        System.out.println("\n*Pre Order Traversal*");
        ops.preOrder(root);
        /*3. Post Order Traversal */
        System.out.println("\n*Post Order Traversal*");
        ops.postOrder(root);
        /*3. Post Order Traversal */
        System.out.println("\n*Level Order Traversal*");
        ops.levelOrder(root);
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
    /*Pre Order Traversal */
    private void preOrder(BSTOpertions.Node root) {
        BSTOpertions.Node start = root;
        if(start != null) {
            System.out.print(start.key+" ");
            preOrder(start.left);
            preOrder(start.right);
        }
    }
    /*Post Order Traversal */
    private void postOrder(BSTOpertions.Node root) {
        BSTOpertions.Node start = root;
        if(start != null) {
            postOrder(start.left);
            postOrder(start.right);
            System.out.print(start.key+" ");
        }
    }
    /*Level Order Traversal */
    private void levelOrder(BSTOpertions.Node root) {
        BSTOpertions.Node start = root;
        int heightOfBST = BSTTraversal.height (start);
        for(int level=1; level <= heightOfBST; level++){
            BSTTraversal.printGivenLevel(start, level);
            System.out.println();
        }
    }
    /*Helper - Height of a BST */
    private static int height(BSTOpertions.Node root) {
        BSTOpertions.Node start = root;
        if(start == null) return 0;
        else{
            return (Math.max( height(start.left), height(start.right))) + 1;
        }
    }
    /*Helper - printGivenLevel of a BST */
    private static void printGivenLevel(BSTOpertions.Node root, int level) {
        BSTOpertions.Node start = root;
        if(start == null) return;
        if(level == 1) System.out.print(start.key+" ");
        else{
            printGivenLevel(start.left , level-1);
            printGivenLevel(start.right , level-1);
        }
    }
}
