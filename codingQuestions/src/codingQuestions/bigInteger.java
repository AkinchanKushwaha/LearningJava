package codingQuestions;

import java.math.BigInteger;
import java.util.Scanner;

public class bigInteger {
	   public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    	Scanner sc = new Scanner(System.in);
	    	BigInteger a = sc.nextBigInteger();
	    	BigInteger b = sc.nextBigInteger();
	    	BigInteger mult = a.multiply(b);
	    	BigInteger add = a.add(b);
	    	System.out.println(a);
	    	System.out.println(b);
	    	
	    }

}
