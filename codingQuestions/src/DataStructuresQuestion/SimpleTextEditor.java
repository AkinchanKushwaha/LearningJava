package DataStructuresQuestion;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        String s ="";
        Stack<String> stack = new Stack<>();
        stack.push(s);
       for(int x = 0 ; x< n ;x++){
        	int t = sc.nextInt();
        	if(t == 1) {
        		 s = s+sc.next();
        		 stack.push(s);
        		
        	}
        	else if(t==2) {
        		int l = sc.nextInt();
        		s=s.substring(0,s.length()-l);
        		stack.push(s);
        		
        		
        	}
        	else if(t==3) {
        		System.out.println(s.charAt(sc.nextInt()-1));
        		
        	}
        	else{
        		stack.pop();
        		s=stack.peek();
        		
        	}
        	
        
        }
        
        
    }
 
}
