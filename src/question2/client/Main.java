package question2.client;

import question2.model.Node;

public class Main{
	 static Node previousNode;

	public static void main(String[] args) {
	     Node root = new Node(50);
	     root.left = new Node(30);
	     root.right = new Node(60);
	     root.left.left = new Node(10);
	     //root.left.right = new Node(35);
	     root.right.left= new Node(55);
	     //root.right.right= new Node(70);
	     
	     print(flatten(root));
		
	}

	private static void print(Node headNode) {
		System.out.println("BST Given is Ascendin Order:");
		while(headNode != null)
		{
			System.out.print(headNode.data+" ");
			headNode = headNode.right;
		}
		
	}

	private static Node flatten(Node root) {
		//Function to traverse the tree in Inorder and assign nodes to its right.
		
		//Creating a dummy head node for the skewed tree
		Node dummyNode = new Node(-1);
		previousNode = dummyNode;
		
		//Calling Inorder Traversal for bst
		Inorder(root);
		
		//Assigning null values to the leaf node
		previousNode.left = null;
		previousNode.right = null;
		
		//Removing the dummyNode and correcting the root value
		Node headNode = dummyNode.right;
		
		
		return headNode;
		
	}

	private static void Inorder(Node root) {
		if (root == null)
		    return;
		Inorder(root.left);
		
		//Assigning left as null and right as the node and making it a previous node
		previousNode.left = null;
		previousNode.right = root;
		previousNode = root;
		
		Inorder(root.right);
		
	}

	
}