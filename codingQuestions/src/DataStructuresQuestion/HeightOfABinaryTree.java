package DataStructuresQuestion;

import java.util.*;
import java.io.*;



class HeightOfABinaryTree {

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.
        if(root == null) return -1;
        
        return Math.max(height(root.left), height(root.right))+1;
    }

	class Node {
	    Node left;
	    Node right;
	    int data;
	    
	    Node(int data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

}
