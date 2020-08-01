package codingQuestions;

import java.io.*;
import java.util.*;

public class MaximumElement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Stack<Integer> obj = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        maxStack.push(Integer.MIN_VALUE); 

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            switch (n) {
            case 1:
                int x = sc.nextInt();
               obj.push(x);
                int max = maxStack.peek();
                if (x > max) {
                    maxStack.push(x);
                } else {
                    maxStack.push(max);
                }
                break;
            case 2:
               obj.pop();
                maxStack.pop();
                break;

            case 3:

                System.out.println(maxStack.peek());
                break;
            }
        }
        sc.close();
    }
}
