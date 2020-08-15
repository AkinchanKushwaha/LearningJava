package DataStructuresQuestion;

import java.util.*;
import java.io.*;

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

class InsertionBST {
   
  	public static void preOrder( Node root ) {
      
    	if( root == null)
        	return;
      
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     
    }

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {
            Node temp = root;
        if(temp == null) {
            return new Node(data);
        }
        while(temp != null) {
            if(data < temp.data) {
                if(temp.left == null) {
                    temp.left = new Node(data);
                    break;
                }
                temp = temp.left;
            }else {
                if(temp.right== null) {
                    temp.right = new Node(data);
                    break;
                }
                temp = temp.right;
            }
        }
        return root;
    	
    }	
}
