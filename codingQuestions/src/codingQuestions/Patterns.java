package codingQuestions;

import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : " );
		int n = sc.nextInt();
//		question 1: * Triangle
		for(int i = 0; i<n ; i++) {
			for(int j = 0; j<i; j++ ) {
				System.out.print("  ");
			}
			for(int j = 0; j<n-i; j++) {
				System.out.print(" *");
			}System.out.println();
		}
//		question 2:Inclined Triangle upside down
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j<i*2; j++) {
				System.out.print(" ");
			}for(int j = 0 ; j < n-i; j++) {
				System.out.print("*");
				}System.out.println();
		}
//		question 3: Simple Pyramid
		for(int i =0 ; i<n ; i++) {
			for(int j = 0 ; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j<i ; j++) {
				System.out.print(" ");
				System.out.print("*");
			}System.out.println();
		}
//			question 4: Two Triangles
		for(int i = 0 ; i < n; i++) {
			for(int j = 0 ; j < n-i-1; j++) {
				System.out.print("  ");
			}for(int j = 0 ; j< i ; j++) {
				System.out.print(" *");
			}System.out.println();
		}for(int i = 0 ; i< n-1 ; i++) {
			for(int j = 0 ; j<i+1; j++) {
				System.out.print("  ");
			}for(int j = 0 ; j< n-i-2; j++) {
				System.out.print(" *");
			}System.out.println();
		}
//		question 5: Number Pyramid.
		
		for(int i = 1 ; i <=n ; i++) {
			int k = 0 ;
			for(int j = 0 ; j < n-i; j++) {
				System.out.print("  ");
			}while( k != 2*i-1) {
				System.out.print(k+1+" ");
				++k;
			}System.out.println();
			
		}
//		question 6 : Hollow Triangle. (left side)
		System.out.println("*");
		for(int i = 0 ; i< n-2 ; i++) {
			for(int j = 0 ; j < n+1; j++) {
				if(j==0 || j==i+1) {
					System.out.print("* ");
					
				}
				else {
						System.out.print("  ");
						
					}
				}System.out.println();
			}if(n>1)
			for(int i = 0 ; i<n ; i++) {
				System.out.print("* ");
		}
//		question 7: Pyramid 
		for(int i = 0 ; i < n ; i++) {
			
			for(int j = 0 ; j<n-i-1; j++) {
				System.out.print("  ");
			}for(int j = 0 ; j<2*i-1; j ++) {
				if(j==0 || j==2*i-2) {
					System.out.print(" "+i);
				}else {
					System.out.print(" 0");
			}
				}
				System.out.println();
		}
//		question :8.  Hollow Triangle.(Right Side)
		for(int i = 0 ; i<n-1 ; i++) {
			System.out.print("  ");
		}System.out.println(" *");
		for(int i = 0 ;i <n-2; i++) {
			for(int j = 0 ; j<n; j++) {
				if(j==n-1 || j==n-i-2) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}if(n>1)
		for(int i = 0 ; i<n; i++) {
			System.out.print(" *");
		}
//		question: 9 Sand glass pattern
		System.out.println("\n");
		 for (int i= 0; i<= n-1 ; i++)
	        {
	            for (int j=0; j <i; j++)
	            {
	                System.out.print(" ");
	            }
	            for (int k=i; k<=n-1; k++) {
	            	System.out.print("*" + " "); } 
	            System.out.println(""); } 
		 for (int i= n-1; i>= 0; i--)
	        {
	            for (int j=0; j< i ;j++)
	            {
	                System.out.print(" ");
	            }
	            for (int k=i; k<=n-1; k++)
	            {
	                System.out.print("*" + " ");
	            }
	            System.out.println("");
	        }
	        
		
	
	}

}
