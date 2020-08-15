package ThirtyDaysOfCodeHackerRank;

import java.util.Scanner;

public class dayTwenty {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here

        int count = 0;
        for(int i = 0 ; i< n-1; i++){
            for(int j = 0 ; j<n-i-1; j++){
                if(a[j] >a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    count = count +1;
                }
            }
        }
        for(int i = 0 ;i <n ; i++) {
        	System.out.println(a[i]);
        }
        System.out.println("Array is sorted in "+count+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
}
