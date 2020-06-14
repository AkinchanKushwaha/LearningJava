package codingQuestions;

import java.util.HashSet;
import java.util.Set;
/* 
 * Given an array, find if there exists a subarray with sum equals to K.
 */

public class SubarrayWithSumK {

	
	public static void main(String[] args)  {
			
		 int [] a = {2,1,3,-4,-2};
		 int k =6;
		 boolean found = false;
		 Set<Integer> set = new HashSet<>();
		 int sum = 0 ;
			 for(int element : a) {
				 set.add(sum-k);
				 sum+= element;
				 if(set.contains(sum)) {
					 found = true;
					 break;
				 }
				 
			 }
		System.out.println(found);

			}

	}


