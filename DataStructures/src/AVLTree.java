import java.util.Scanner;

public class AVLTree<T extends Comparable<T>> {
	private class Node{
		T data;
		Node left, right;
		
		// Balance Factor
		int bf;
		
		// Height of the node in tree
		int height;
		
		public Node(T data) {
			this.data =data;
		}
	}
	
	
	private Node root;
	
	private int nodeCount = 0;
	
	public int height() {
		if(root == null) {
			return 0;
		}
		else return root.height;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int size() {
		return nodeCount;
	}
	
	public boolean contains (T val) {
		return contains(root, val);
	}
	
	private boolean contains(Node node, T val) {
		if(node == null) {
			return false;
		}
		
		int cmp = val.compareTo(node.data);
		
		if(cmp<0) return contains(node.left, val);
		if(cmp>0) return contains(node.right, val);
		return true;
	}
	
	public boolean insert(T val) {
		if(val == null) return false;
		if(!contains(root, val)) {
			root = insert(root, val);
			nodeCount++;
			return true;
		}
		return false;
	}
	
	private Node insert(Node node , T val) {
		if(node == null) return new Node(val);
		
		int cmp = val.compareTo(node.data);
		
		if(cmp<0) insert(node.left, val);
		else insert(node.right, val);
		
		update(node);
		
		return balance(node);
	}
	
	private void update(Node node) {
		int leftNodeHeight = (node.left == null)? -1: node.left.height;
		int rightNodeHeight = (node.left == null)? -1: node.right.height;
		
		node.height = 1 + Math.max(leftNodeHeight, rightNodeHeight);
		
		node.bf = rightNodeHeight - leftNodeHeight;
	}
	
	private Node balance(Node node) {
//		left heavy
		if(node.bf == -2) {
//			left-left case
			if(node.left.bf <=0) {
				return leftleftCase(node);
//			left-right case
			}else {
				return leftRightCase(node);
			}
//		right heavy
		}else if(node.bf == 2) {
//			right-right case
			if(node.right.bf >=0) {
				return rightRightCase(node);
//			right-left case
			}else {
				return rightLeftCase(node);
			}
		}
//		Node either has a balance factor of 0, +1 or -1.
		return node;
	}
	
	private Node leftleftCase(Node node) {
		return rightRotation(node);
	}
	private Node leftRightCase(Node node) {
		node.left = leftRotation(node.left);
		return leftleftCase(node);
	}
	private Node rightRightCase(Node node) {
		return leftRotation(node);
	}
	private Node rightLeftCase(Node node) {
		node.right = rightRotation(node);
		return rightRightCase(node);
	}
	
	private Node rightRotation(Node node) {
		Node newParent = node.left;
		node.left = newParent.right;
		newParent.right = node;
		update(node);
		update(newParent);
		return newParent;
	}
	
	private Node leftRotation(Node node) {
		Node newParent = node.right;
		node.right = newParent.left;
		newParent.left = node;
		update(node);
		update(newParent);
		return newParent;
	}
	
	public boolean remove(T elem) {
		if(elem == null) return false;
		
		if(contains(root, elem)) {
			root = remove(root,elem);
			nodeCount--;
			return true;
		}
		return false;
	}
	
	private Node remove(Node node , T elem) {
		if(node == null) return null;
		
		int cmp = elem.compareTo(node.data);
		
		if(cmp <0) {
			node.left = remove(node.left, elem);
		}else if(cmp > 0) {
			node.right = remove(node.right, elem);
		}else {
			if(node.left == null) {
				return node.right;
			}else if(node.right == null) {
				return node.left;
			}else {
				
				
				if(node.left.height > node.right.height) {
					T successorValue = findMax(node.left);
					node.data = successorValue;
					node.left = remove(node.left, successorValue);
				}else {
					T successorValue = findMin(node.right);
					node.data = successorValue;
					node.right = remove(node.right, successorValue);
				}
			}
		}
		
		update(node);
		return balance(node);
	}
	
	private T findMin(Node node) {
		while(node.left != null) {
			node = node.left;
		}
		return node.data;
	}
	
	private T findMax(Node node) {
		while(node.right != null) {
			 node = node.right;
		}
		return node.data;
	}
	
	public void print() {
		Node temp = root;
		inOrder(temp);
	}
	private void inOrder(Node node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
		
	}
	
	

}

