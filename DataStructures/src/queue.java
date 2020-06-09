import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String args []) {
		Queue<Integer> q = new LinkedList<>();
//		Queue follows FIFO concept.
		
		q.add(12);
		q.add(43);
		
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q.remove());
//		System.out.println(q.element());
//		System.out.println(q.remove()); //throws an exception when the queue is empty.
		System.out.println(q.poll()); //returns null when the queue is empty.
		
/*
 * Methods of Queue 
 *  1.Throws exception
 * add()
 * remove()
 * element()
 *  2.Return values
 * offer()
 * poll()
 * peek()
 */
	}

}
