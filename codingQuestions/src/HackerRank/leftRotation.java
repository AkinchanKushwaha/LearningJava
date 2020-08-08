package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class leftRotation {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        int size = a.length;
        int [] rotated_arr = new int [size];
        
        int i = 0 ;
        int rotate = d;
        
        while(rotate < size) {
            rotated_arr[i] = a[rotate];
            i++;
            rotate++;
        }
        rotate = 0 ;
        while(rotate <d) {
            rotated_arr[i] = a[rotate];
            i++;
            rotate++;
        }
        for(i = 0 ; i< rotated_arr.length; i++)
        {
            System.out.print(rotated_arr[i]+" ");
        }


        scanner.close();
    }
}

