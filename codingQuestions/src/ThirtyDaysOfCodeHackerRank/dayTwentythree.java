package ThirtyDaysOfCodeHackerRank;


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

class dayTwentythree {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {
      LinkedList<Node> queue = new LinkedList<>();
      queue.add(root);

      while(!queue.isEmpty()){
          Node temp = queue.poll();
          System.out.print(temp.data+" ");

          if(temp.left  != null) queue.add(temp.left);
          if(temp.right != null) queue.add(temp.right);

      }
      
    }

}