Tree in DS
1. Types of Tree
    a. Binary Tree
    b. Binary Search Tree (1 type of Binary tree)  [BST]
    c. Ternary Search Tree (3 children at most) [TST]
    d. AVL Tree 
    e. B-Tree

A binary Search Tree is a node-based binary tree data structure that has the following properties:  
* The left subtree of a node contains only nodes with keys lesser than the node’s key.
* The right subtree of a node contains only nodes with keys greater than the node’s key.
* The left and right subtree each must also be a binary search tree.
* There must be no duplicate nodes.

[ Definition ]
1.a. BINARY TREE is a nonlinear data structure where each node can have at most two child nodes. 
1.b. BINARY SEARCH TREE is a node based binary tree that further has right and left subtree that too are binary search tree.

[ Duplicate Values ]
1.a. Binary trees allow duplicate values.
1.b. Binary Search Tree does not allow duplicate values.

[ Structure ]
1.a. In BINARY TREE there is no ordering in terms of how the nodes are arranged
1.b. In BINARY SEARCH TREE the left subtree has elements less than the nodes element and the right subtree has elements greater than the nodes element.

[ Speed ]
1.a. The speed of deletion, insertion, and searching operations in Binary Tree is slower as compared to Binary Search Tree because it is unordered. 
1.b. Because the Binary Search Tree has ordered properties, it conducts element deletion, insertion, and searching faster.

[ Complexity ]
1.a. Time complexity is usually O(n).
1.b. Time complexity is usually O(logn).

[ Application ]
1.a. It is used for retrieval of fast and quick information and data lookup.
1.b. It works well at element deletion, insertion, and searching.

[ Usage ]
1.a. foundation of implementing Full Binary tree, BSTs, Perfect Binary Tree etc.
1.b. used to implement Balanced Binary Search Trees such as AVL Tree, Red Black Tree etc.

---------------------------------------------------------------------------------------------------------------------

1.b. Here, each node has at most two children. 
1.c. Here, each node has three children

1.b. The left child is always smaller than the parent node, and the right child is always greater.
1.c. The left child for values smaller than the node, a middle child for values equal to the node, and a right child for values greater than the node.

[ String Searching ]
1.b. They are not as efficient as TSTs due to the absence of a middle child
1.c. TSTs are particularly useful for string searching operations. They allow efficient prefix searches

Application of Binary Search Tree:
 * BSTs can be used to store and retrieve data quickly, such as in databases, where searching for a specific record can be done in logarithmic time.
 * BSTs can be used as self-balancing data structures such as AVL tree and Red-black tree.
 * BSTs can be used to implement graph algorithms, such as in minimum spanning tree algorithms

Application of Ternary Search Tree:
 * It can be used to implement the auto-complete feature efficiently.
 * Can be used for spell checkers.
 * Near neighbor searching.
---------------------------------------------------------------------------------------------------------------------

Terminologies 
* Node: the node is an entity in a tree data structure that contains a key or a value and pointers to its child nodes. 
Child node: A child node is the descendant of any node.
Leaf nodes: The nodes which don’t have any child nodes and are the bottom-most node in a tree. They are also called the external nodes.
Parent node: This node is located directly above a node. It is the principal in the hierarchy. For example, 50 is the parent node of 60, 70, and 80.
Root: It is the topmost point of a tree.
Internal node: The node having at least one child node.
Edge: An edge refers to the connection between any two nodes in a tree.
Height of a node: Number of edges from the node to the deepest leaf.
Depth of a node: Number of edges from the root to the node. The root node’s depth is zero. Any other node’s depth is the number of edges it derives from the root node.
Degree of a tree: It denotes the maximum of all the probable degrees of its nodes.
Number of edges: If a tree has n nodes, the number of edges would be n-1. Excluding the root node, all other nodes in the tree possess a minimum of one incoming edge.
Height of a tree: Height of the root node. It is the path length from a specific node to the extreme leaf node. It is always calculated from bottom to top. Hence, each leaf’s height is 0.
Degree of a node: Total number of branches to that node.
Forest: A collection of disjoint trees.
Subtree: It denotes children in the tree. Every child is either a leaf node or a subtree.
Generation: Nodes existing at the same level of the tree are called a generation. For instance, 60, 70, and 80 belong to the same generation.
Ancestor: Suppose there are two nodes, A and B, and there is a path from A to B, then A is the ancestor of B. It is common terminology used in various trees in data structure.
Descendent: It is the reverse of an ancestor.
Sibling: Two nodes with the same parent are called siblings. Suppose 70, 80, and 90 are siblings and 100 is the parent.
You can also consider doing our Python Bootcamp course from upGrad to upskill your career.

Subtree: It denotes children in the tree. Every child is either a leaf node or a subtree.
Generation: Nodes existing at the same level of the tree are called a generation. For instance, 60, 70, and 80 belong to the same generation.
Ancestor: Suppose there are two nodes, A and B, and there is a path from A to B, then A is the ancestor of B. It is common terminology used in various trees in data structure.
Descendent: It is the reverse of an ancestor.
Sibling: Two nodes with the same parent are called siblings. Suppose 70, 80, and 90 are siblings and 100 is the parent.
Levels: The root node exists at level zero, and its children exist at level one. Level one’s children exist at level two.
