import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node{
	int data;
	Node left;
	Node right;
}

class BSTOperations{
	public Node insertElement(Node root, int data){
		if(root == null){
			Node node = new Node();
			node.data = data;
			node.right = null;
			node.left = null;

			return node;
		}

		if(data < root.data){
			root.left = insertElement(root.left, data);
		}else if(data > root.data){
			root.right = insertElement(root.right, data);
		}

		return root;
	}

	public Node search(Node root, int data){
		if(root == null || root.data == data) return root;

		if(root.data > data){
			return search(root.left , data);
		}else if(root.data < data){
			return search(root.right, data);
		}
		return root;
	}

	public List<Integer> inOrderTraverse(Node root){
		List<Integer> inorderedTree = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<Node>();

		Node node = root;
		while(node != null || !stack.isEmpty()){
			while(node != null){
				stack.push(node);
				node = node.left;
			}

			node = stack.pop();
			inorderedTree.add(node.data);
			node = node.right;
		}
		return inorderedTree;
	}

	public void inOrderTraverse2(Node root){
		if(root == null) return ;
		
		inOrderTraverse2(root.left);
		//System.out.println(root.data);
		inOrderTraverse2(root.right);
	}

	public void postOrderTraverse(Node root){
		if(root == null) return;
		postOrderTraverse(root.left);
		postOrderTraverse(root.right);
		//System.out.println(root.data);
	}

	public void preOrderTraverse(Node root){
		if(root == null) return;
		System.out.println(root.data);
		preOrderTraverse(root.left);
		preOrderTraverse(root.right);
	}

	public Node deleteNode(Node root, int ele){
		//case 1: if the bst doest not have any element
		if(root == null) return null;

		//case 2: if element is lesser than root
		if(ele < root.data) root.left = deleteNode(root.left, ele);
		//case 3: if element id greater than root
		else if(ele > root.data) root.right = deleteNode(root.right, ele);

		//case 3: element === root.data
		else{
			//case 1 & case 2: if element has 1 child or no child
			if(root.left == null) return root.right;
			else if(root.right == null) return root.left;

			//case 3: if element has 2 children
			else{
				root.data = minNode(root.right);
				root.right = deleteNode(root.right, root.data);
			}
		}
		return root;
	}

	//finding out minimum node in a bst
	public int minNode(Node root){
		int minValue = root.data;
		while(root.left != null){
			minValue = root.data;
			root = root.left;
		}
		return minValue;
	}

	//find out the height of a tree in java
	public int findHeight(Node root){
		return 0;
	}
}

public class BSTApp{
	public static void main(String[] arg){
		BSTOperations bstA = new BSTOperations();
		Node root = null;    // -> root node of a bst

		//inserting elements in BST 
		root = bstA.insertElement(root, 50);
		root = bstA.insertElement(root, 30);
		root = bstA.insertElement(root, 20);
		root = bstA.insertElement(root, 40);
		root = bstA.insertElement(root, 70);
		root = bstA.insertElement(root, 60);
		root = bstA.insertElement(root, 80);

		//Searching an element in BST 
		//root = bstA.search(root, 50);

		//inorder travarsal using stack 
			//List<Integer> inorderedTree = bstA.inOrderTraverse(root);

		//inorder travarsal using normal recursion
			//bstA.inOrderTraverse2(root);

		//postorder traversal using normal recursion
			//bstA.postOrderTraverse(root);

		//preorder travarsal using normal recursion
			//bstA.preOrderTraverse(root);

		//deleting a node from bst
			int ele = 20;    //----> The node to be deleted!
			root = bstA.deleteNode(root, ele);

		//height of a tree
			int treeHeight = bstA.findHeight(root);
			System.out.println("Height of a tree? :"+treeHeight);
	}
}