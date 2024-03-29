package com.swagger.demo.model;

//CPP program to create a tree with left child 
//right sibling representation. 

public class GFG { 
	
	private static class Node {
		public Node[] children;
		public Node right,left;
		private int value;

		public Node(int value) {
		this.value = value;
		}

		private void populateRightSiblings(Node node) {
		if (node == null || node.children == null || node.children.length < 2)
		return;

		if (node.children.length > 1) {
		Node lastChild = node.children[node.children.length - 1];
		node.right = lastChild;
		}

		for (Node child : node.children) {
		populateRightSiblings(child);
		}
		}

		@Override
		public String toString() {
		return String.valueOf(value);
		}
		}
	
	static void printInorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        /* first recur on left child */
        printInorder(node.left); 
  
        /* then print the data of node */
        System.out.print(node.value + " "); 
  
        /* now recur on right child */
        printInorder(node.right); 
    } 
	  

		public static void main(String[] args) {
		Node _1 = new Node(1);
		Node _6 = new Node(6);
		Node _8 = new Node(8);
		Node _11 = new Node(11);
		Node _13 = new Node(13);
		Node _15 = new Node(15);
		Node _17 = new Node(17);
		Node _22 = new Node(22);
		Node _25 = new Node(25);
		Node _27 = new Node(27);

		_1.children = new Node[]{_6};
		_8.children = new Node[]{_1,_11};
		_13.children = new Node[]{_8,_17};
		_17.children = new Node[]{_15,_25};
		_25.children = new Node[]{_22,_27};

		Node root = _13;
		printInorder(root);
		root.populateRightSiblings(root);
		System.out.println(root);
		
		printInorder(root);
		}
} 

//This code is contributed by M.V.S.Surya Teja. 
