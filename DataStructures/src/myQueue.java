

public class myQueue<E> {

	Node<E> head;
	Node<E> rear;
	
	
	public void enqueue(E e) {
		Node<E> toAdd = new Node<>(e);
		if(head == null) {
			head =rear = toAdd;
			return;
		}
		rear.next = toAdd;
		rear = rear.next;
		
		
	}
	public E dequeue() {
		
		if(head == null) {
			return null;
		}
		
		Node<E> temp = head ;
		head=head.next;
		
		if(head == null) {
			rear= null;
		}
		return temp.data;
		
	}
	public static class Node<E> {
		E data;
		Node<E> next;
		public Node(E data) {
			this.data = data;
			next = null;
		}
		

	}
	public static void main(String [] args) {
		myQueue<Integer> mq = new myQueue<>();
		mq.enqueue(21);
		System.out.println(mq.dequeue());
		
		System.out.println(mq.dequeue());
	}

}
