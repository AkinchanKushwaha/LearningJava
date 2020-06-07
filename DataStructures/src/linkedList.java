import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedList {

	public static void main(String[] args) {
//		In LinkedLIst elements are linked using pointers and addresses.
//		Each element is known as node.
//		Manipulation in LinkedList is faster than ArrayList.
//		It uses doubly LinkedList, so no bit shifting is required.
		
		
		List<Integer> ll = new LinkedList<>();
		List<Integer> al = new ArrayList<>();
		
		getTimeDifference(ll);
		getTimeDifference(al);
		
/*		Methods of List
 * 1.add(element)
 * 2.addAll(collection)
 * 3.get(index)
 * 4.set(index, value)
 * 5.remove(index)
 * 6.removeAll()
 * 7.clear()
 * 8.size()
 * 9.contains()
 * 10.isEmpty()  
 * 11.toArray() 
 */

		
		
		
		
	}
//	Method to calculate the time taken for adding an Element at index 0 in the List.
	static void getTimeDifference(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i< 100000; i++) {
			list.add(0,i);
			
			
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName()+" "+(end-start));
		
	}

}
