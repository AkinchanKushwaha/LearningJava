class BSTimplementation{
	
	private int nodeCount = 0;
	private Node root = null;
	
//================ADD function========================	
	
	// duplicates in binary tree are not allowed.
	public boolean add(int data) {
		if(contains(data)) {
			return false;
		}else {
			root = add(root, data);
			nodeCount++;
			return true;
		}
	}
	
	//private method to add a value in binary tree recursively
	private Node add(Node node, int data) {
		if(node == null) {
			node = new Node(null, null, data);
		}
		
		if(node.data < data) {
			node.left = add(node.left, data);
		}
		else if(node.data > data) {
			node.right = add(node.right, data);
		}
		return node;
	}
//===================================================	
	
//================REMOVE function=====================
	
	public boolean remove (int data) {
		if(contains(data)) {
			root = remove(root, data);
			nodeCount--;
			return true;
		}
		return false;
	}
	
	// private method to remove value recursively.
	private Node remove(Node node, int data) {
		if(node == null) {
			return null;
		}
		
		if(data< node.data) {
			node.left = remove(node.left, data);
		}else if(data > node.data) {
			node.right = remove(node.right, data);
		}else { //found the node that we want to remove.
			
			if(node.left == null) {
				Node rightChild = node.right;
				return rightChild;
			}else if (node.right == null) {
				Node leftChild = node.left;
				return leftChild;
			}else {
				Node tmp = digLeft(node.right); // find the leftmost node in the right subtree.
				
				node.data = tmp.data;
				
				node.right = remove(node.right, tmp.data);
				
				/*
				 * find the rightmost node in the left subtree.
				 * Node tmp = difRight(node.left);
				 * node.data = tmp.data;
				 * node.left = remove(node.left, tmp.data);
				 */
				
			}
			
		}
		return node;
	}
	//method to find leftmost node.
	private Node digLeft(Node node) {
		Node temp = node;
		while(temp.left != null) {
			temp = temp.left;
		}
		return temp;
	}
	
//====================================================

//======================CONTAINS function=============
	public boolean contains(int data) {
		return contains(root, data);
	}
	
	private boolean contains(Node node, int data) {
		if(node == null) {
			return false;
		}
		if(data > node.data) {
			return contains(node.right, data);
		}else if(data < node.data) {
			return contains(node.left , data);
		}else return false;
	}
	
//===================================================
//======================INORDER TRAVERSAL============
	public void print() {
		Node temp = root;
		printInOrder(temp);
	}
	private void printInOrder(Node node) {
		if(node == null) {
			return ;
		}
		
		printInOrder(node.left);
		System.out.println(node.data);
		printInOrder(node.right);
	}
	
	public int size() {
		return nodeCount;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
//====================NODE============================
	private class Node{
		int data;
		Node left, right;
		public Node(Node right, Node left ,int data) {
			this.data = data;
			this.right = right;
			this.left = left;
		}
	}
	
//=====================================================	
	
	public static void main(String[] args) {
		BSTimplementation bst = new BSTimplementation();
		for(int i = 0 ; i<10 ; i++) {
			bst.add(i);
		}
		bst.print();
		bst.remove(1);
	}
}