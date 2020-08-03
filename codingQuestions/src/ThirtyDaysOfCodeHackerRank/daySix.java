package ThirtyDaysOfCodeHackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class daySix{
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String s=sc.next();
            for(int i=0;i<s.length();i++){
                if(i%2==0){
                    System.out.print(s.charAt(i));
                }   
            }
            System.out.print(" ");
            for(int i=0;i<s.length();i++){
                if(i%2==1){
                    System.out.print(s.charAt(i));
                }   
            }  
            t--;
            System.out.println();
        }   
    }
}