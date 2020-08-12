package codingQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
    String whatsYourName() {
    	return "I have many names and types.";
    }
}

class Jasmine extends Flower{
	String whatsYourName() {
		return "Jasmine";
	}
}

class Lily extends Flower{
	String whatsYourName() {
		return"Lily";
	}
}

class Region {
   Flower f = new Flower();
   Flower yourNationalFlower() {
	   return f;
   }
   
}

class WestBengal extends Region {
	Jasmine j = new Jasmine();
    Jasmine yourNationalFlower() {
    	return j;
    }
}

class AndhraPradesh extends Region{
    Lily l = new Lily();
    Lily yourNationalFlower() {
    	return l;
    }
}


public class CovarientReturnTypes {
  public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine().trim();
      Region region = null;
      switch (s) {
        case "WestBengal":
          region = new WestBengal();
          break;
        case "AndhraPradesh":
          region = new AndhraPradesh();
          break;
      }
      Flower flower = region.yourNationalFlower();
      System.out.println(flower.whatsYourName());
    }
}
