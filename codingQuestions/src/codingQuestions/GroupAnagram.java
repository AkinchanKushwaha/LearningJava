package codingQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GroupAnagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Strings");
		int n = sc.nextInt();
		String [] arr = new String[n];
		sc.nextLine();
		for(int i = 0 ; i<n ; i++) {
			arr[i] = sc.nextLine();
		}
		System.out.println(groupAnagrams(arr));

	}
	public static List<List<String>> groupAnagrams(String[] strs){
		Map<String, List<String>> map  = new HashMap<>();
		for(String s : strs) {
			char charArray[] = s.toCharArray();
			Arrays.parallelSort(charArray);
			String sorted = new String(charArray);
			
			if(!map.containsKey(sorted)) {
				map.put(sorted, new LinkedList<String>());
				
			}
			map.get(sorted).add(s);
		}
		return new LinkedList<>(map.values());
	}

}
