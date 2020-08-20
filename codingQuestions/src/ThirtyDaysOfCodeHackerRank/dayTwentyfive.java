package ThirtyDaysOfCodeHackerRank;

import java.util.Scanner;

public class dayTwentyfive
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int i = 0; i < p; i++)
        {
            int n = in.nextInt();
            if(n==1) System.out.println("Not prime");
            else 
            {
                boolean check=true;
                int l=(int)Math.sqrt(n);
                for(int j=2;j<=l;++j) 
                    if(n%j==0)
                    {
                        check=false; 
                        j=n;
                    }
                if(check) System.out.println("Prime");
                else System.out.println("Not prime");
            }
        }
    }    
}