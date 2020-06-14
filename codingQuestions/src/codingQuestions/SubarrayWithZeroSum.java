package codingQuestions;

import java.util.HashSet;
import java.util.Set;

/*
 * Given an array, find if there exists a subarray with sum equals to zero.
 * n<10^5
 */

public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		
	 int [] a = {2,1,3,-4,-2};
	 boolean found = false;
	 Set<Integer> set = new HashSet<>();
	 int sum = 0 ;
	 for(int element : a) {
		 set.add(sum);
		 sum+= element;
		 if(set.contains(sum)) {
			 found = true;
			 break;
		 }
		 
	 }
	 System.out.println(found);

	}

}
