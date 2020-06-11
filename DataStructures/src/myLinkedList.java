


public class myLinkedList<E> {
	 Node<E> head;
	private int size = 0;
	
	public void add(E data) {
		Node<E> toAdd = new Node<>(data);
		if(head == null) {
			head = toAdd;
			size++;
			return;
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
		size++;
	
	}
	
	
	public void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public int size() {
		return size;
	}
	
	
	public void clear() {
		head = null;
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
	public static class Node<E> {
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
		System.out.println(myll.size());
		myll.print();
	}
	
	
}