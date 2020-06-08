

public class myLinkedList<E> {
	Node<E> head;
	
	public void add(E data) {
		Node<E> toAdd = new Node<>(data);
		if(head == null) {
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	
	}
	
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public E removeLast() throws Exception{
		
		Node<E> temp = head;
		
		if(temp==null) {
			throw new Exception("Cannot remove last element from last.");
		}
		if(temp.next== null) {
			Node<E> toRemove = head;
			head = null;
			return toRemove.data; 
			
		}
		while(temp.next.next !=null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	
	
	public E getLast() throws Exception{
		Node<E> temp = head;
		
		if(temp==null) {
			throw new Exception("Cannot peek last element from last.");
		}
		
		while(temp.next !=null) {
			temp = temp.next;
		}
		return temp.data;

		
	}
	static class Node<E> {
		E data;
		Node<E> next;
		public Node(E data) {
			this.data = data;
			next = null;
		}
		

	}
	public static void main(String [] args) {
		myLinkedList<Integer> myll = new myLinkedList<>();
		for(int i = 0 ; i<10 ; i++) {
			myll.add(i);
		}
		myll.print();
	}
	
	
}