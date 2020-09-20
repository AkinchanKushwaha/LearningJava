package codingQuestions;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class JavaMap{
	public static void main(String []argh)
	{
	Scanner in = new Scanner(System.in);
      HashMap<String ,Integer> myMap = new HashMap<String,Integer>();
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
          String name=in.nextLine();
          int phone=in.nextInt();
          in.nextLine();
          myMap.put(name,phone);
      }
      while(in.hasNext())
      {
          String s=in.nextLine();
          if(myMap.get(s)==null){
              System.out.println("Not found");
          }else{
              System.out.println(s + "=" + myMap.get(s));
          }
      }
	}
}



