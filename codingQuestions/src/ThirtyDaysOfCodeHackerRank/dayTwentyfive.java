package ThirtyDaysOfCodeHackerRank;

import java.util.Scanner;

public class dayTwentyfive
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++)
        {
            int n = in.nextInt();
            if(n==1) System.out.println("Not prime");
            else 
            {
                boolean check=true;
                int l=(int)Math.sqrt(n);
                for(int i=2;i<=l;++i) 
                    if(n%i==0)
                    {
                        check=false; 
                        i=n;
                    }
                if(check) System.out.println("Prime");
                else System.out.println("Not prime");
            }
        }
    }    
}