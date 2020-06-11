import java.util.PriorityQueue;

public class priorityQueue {
	public static void main(String[] args) {
	/* A priority queue is a special type of queue in which each
	 * element is associated with a priority and is served according
	 * to its priority. if elements of same priority occur, they are 
	 * served according to their order in the queue. 
	 */
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("kiwi");
		pq.add("apple");
		pq.add("mango");
		pq.add("banana");
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		
		
		
	}
}
