import java.util.ArrayList;

public class arrayList {
	public static void main(String [] args) {
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<String> vegetables = new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		vegetables.add("Potato");
		vegetables.add("carrot");
		System.out.println(fruits);
		fruits.addAll(vegetables); //to add all the elements of one list to another
		System.out.println(fruits.get(1));
		System.out.println(fruits.size()); //size of the list
		System.out.println(fruits.contains("guava")); //to check if the list contains the following element
		fruits.set(1,"banana"); //to change the String at a specific index
		System.out.println(fruits.get(1));
		fruits.remove(0); // to remove a String at a specific index
		System.out.println(fruits);
//		fruits.clear(); // to clear the whole Arraylist
		System.out.println(fruits);
		ArrayList<String> toRemove = new ArrayList<>();
		toRemove.add("apple");
		toRemove.add("orange");
		fruits.removeAll(toRemove); // removes all the elements that are mutual in both list
		System.out.println(fruits);
		System.out.println(fruits.isEmpty());
		
		String temp[] = new String[fruits.size()];
		fruits.toArray(temp);
		for(String e :temp) {
			System.out.println(e);
		}
		
		
		

	}



}
