https://leetcode.com/problems/binary-tree-preorder-traversal/description/
Given the root of a binary tree, return the preorder traversal of its nodes' values.
To refer the picture use the link.

TEST CASES :-
Input: root = [1,null,2,3]
Output: [1,2,3]

Input: root = []
Output: []

Input: root = [1]
Output: [1]

***Key Note: Never use static variable in Leetcode bcz the Driver code run all the test cases in a single transactions using some collections 
--------------------------------------------------------------------------------

class Solution {
    TreeNode prevNode = new TreeNode();
    boolean isFirst = true;
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<Integer>();
        if(root.right == null && root.left == null){  
            result.add(root.val);  
            return result;
        }
        if(root != null && (isFirst==true || prevNode.right != null || prevNode.left != null) ) {
            isFirst = false;
            result.add(root.val);
            prevNode = root;
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return result;
    }
}
