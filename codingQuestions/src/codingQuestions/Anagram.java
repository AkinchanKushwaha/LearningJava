package codingQuestions;

import java.util.Scanner;

public class Anagram {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String a = sc.next();
		System.out.println("Enter second String: ");
		String b = sc.next();
		int[] x = new int[256];
		boolean isAnagram = true;
		for(char c : a.toLowerCase().toCharArray()) {
			int index = (int) c;
			x[index]++;
			
		}
		for(char c : b.toLowerCase().toCharArray()) {
			int index = (int)c;
			x[index]--;
		}
		for(int i = 0 ; i<256; i++) {
			if(x[i]!=0) {
				isAnagram = false;
				break;
			}
			
			
		}
		if(isAnagram)
			System.out.println("Anagram !");
		else
			System.out.println("Not Anagram ! ");
		
		
	}

}