
public class myDoublyLinkedList<E> {
		
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0 ; 
	
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty() {
		if(size()== 0 ) {
			return true;
		}
		else return false;
	}
	
	public void addLast(E data) {
		if(isEmpty()) {
			head = tail = new Node<E>(data, null, null);
		}
		else {
			tail.next = new Node<E>(data,tail, null);
			tail = tail.next;
		}
		size++;
	}
	
	public E removeLast() {
		if(isEmpty()) {
			throw new RuntimeException ("empty list");
		}
		
		E data = tail.data;
		tail = tail.prev;
		--size;
		
		if(isEmpty()) {
			head = null;
		}
		else {
			tail.next = null;
		}
		return data;
	}
	
	public void clear () {
		Node<E> temp = head;
		while(temp != null) {
			Node<E> next = temp.next;
			temp.prev = temp.next = null;
			temp.data = null;
			temp = next;
		}
		head = tail = temp = null;
		size= 0;
		
	}
	
	public void print() {
		if(isEmpty()) {
			return;
		}
		Node<E> temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	
	public static class Node<E>{
		private E data;
		Node<E> next, prev;
		public Node(E data, Node<E> prev, Node<E>next) {
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}
	
	public static void main(String args[]) {
		myDoublyLinkedList<Integer> dll = new myDoublyLinkedList<>();
		for(int i = 0 ; i< 5 ; i++) {
			dll.addLast(i);
		}
		
		System.out.println(dll.removeLast());
		dll.print();
		
		
	}

}
