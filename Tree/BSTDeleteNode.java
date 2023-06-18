/*
 * Tree: 
 *                   100                   
 *                 /    \
 *             50(D)         105
             /     \
            30      70
           /      /      \
         20     60         75
              /    \     /   \
             55(P)  62   73   77
              \
               57
              /  \
            56    58


After Delete how the tree will look like is as below: (property of a BST is still conserved)

                      100
                  /         \
                55         105
             /     \
            30      70
           /      /      \
         20     60         75
              /    \     /   \
             57    62   73   77
            /  \
          56    58

 * 1. Delete a Node (e.g. - 50. new node value to replace is 55 as lowest among right sub tree )
 */
public class BSTDeleteNode {
    public static void main(String[] args) {
        BSTOpertions.Node root = null;
        // int[] nodes = new int[]{50,30,40,20,70,60,80};
        int[] nodes = new int[]{100,50,105,30,20,70,60,75,55,62,57,56,58,73,77};
        BSTDeleteNode ops = new BSTDeleteNode();
        root = ops.createTree(nodes);
        /*------------------------------------------------ */
        root = ops.deleteNode(root, 50);
        System.out.println(root.key);

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

    /*Delete a Node */
    private BSTOpertions.Node deleteNode (BSTOpertions.Node root, int value) {
        //base
        if(root == null) return null;

        //iterate over left / right subtree unless we found match with key value
        if(value < root.key){
            root.left = deleteNode(root.left, value);
            return root;
        }else if(value > root.key){
            root.right = deleteNode(root.right, value);
            return root;
        }

        //case 1: if root has no child
        if(root.right == null && root.left == null) return null;
        //case 2: if root has 1 child
        else if(root.right != null || root.left != null) {
            if(root.right == null) return root.left;
            else if(root.left == null) return root.right;
        }
        //case 3: it has both the children 

            //BSTOpertions.Node delNode = root;  //succParent
            BSTOpertions.Node rightSubTreeRoot = root.right;
            //if there is no left node of right sub tree
            if(rightSubTreeRoot.left == null){
                root.right = rightSubTreeRoot.right; // basically root.right = root.right.right 
                root.key = rightSubTreeRoot.key; //copying rightsubtree value
                return root;
            }

            BSTOpertions.Node prvRoot = null;
            while(rightSubTreeRoot.left != null){
                prvRoot = rightSubTreeRoot;
                rightSubTreeRoot = rightSubTreeRoot.left;
            }
            root.key = rightSubTreeRoot.key; //copy the last left node value(lowest in right sub tree) in root value
            if(prvRoot != null)
                prvRoot.left = rightSubTreeRoot.right; // rightSubTreeRoot.left will always be null since this is the last node in right sub tree(lowest in right sub tree)
            return root;

    } 

}

/*
 * -----------------------------------------------------------------------------------------------------------------------------------------------
 * Notes:
 * 
 * Deleting a Node from BST
 * there are 3 cases as follows:
 * i> that node is a Leaf Node
 * ii> node has single child
 * iii> node has 2 children
 * 
 * i> simply delete the reference and clear the memory
 * 
 * ii> base condition:
  if( root.left == null ) root = root.right;
  else if (root.right == null) root = root.left;

  iii> there can be 2 possibilities
  a) find lowest in right sub-tree > copy the value and paste to the deleted node.value > delete the node
  b) find the largest in left sub tree > copy the value paste to the deleted node.value > delete the node
 */
