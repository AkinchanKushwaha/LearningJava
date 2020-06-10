import java.util.ArrayDeque;

public class arrayDeque {
	public static void main(String args []) {
//		In a deque, we can insert and remove elements from both front and rear.
//		It can be used as a deck or queue.
//		deque are much faster than linked list.
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.addFirst(123);
		ad.add(434);
		
		ad.pop();
		System.out.println(ad.peek());
		
		ad.push(13);
		ad.push(43);
		
		System.out.println(ad.pop());
/*	Methods of Deque:
 * 
 * ====Throws Exception====
 * 1.addFirst(i)
 * 2.removeFirst()
 * 3.getFirst()
 * 4.addLast(i)
 * 5.removeLast()
 * 6.getLast()
 * 
 * ====Special value====
 * 1.offerFirst(i)
 * 2.pollFirst()
 * 3.peekFirst()
 * 4.offerLast(i)
 * 5.pollLast()
 * 6.peekLast()
 * 
 * 
 * 
 * 
 */
	
	}

}
