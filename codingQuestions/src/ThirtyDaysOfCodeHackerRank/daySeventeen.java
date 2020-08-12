package ThirtyDaysOfCodeHackerRank;

import java.util.*;
import java.io.*;

//Write your code here
class Calculator{
	int power (int a, int b) throws Exception{
		int result = 1;
		if(a<0||b<0) {
			throw new Exception("n and p should be non-negative");
		}
		for(int i = 0 ; i<b ;i++) {
			 result = result*a;
		}
		return result;
	}
}

class daySeventeen{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
