
public class myDeque <E>{
	private Node<E> head, tail;
	public void addToHead(E data) {
		Node <E> toAdd = new Node<>(data);
		if(head == null) {
			head = tail = toAdd;
		}
		head.next = toAdd;
		toAdd.prev = head;
		head = toAdd;
		
		
	}
	public E removeLast() {
		if(head == null) {
			return null;
		}
		Node<E> toRemove = tail;
		tail = tail.next;
		tail.prev = null;
		if(tail == null) {
			head = null;
		}
		return toRemove.data;
		
		
	}
	
	
	
	
	public static class Node<E>{
		E data;
		Node<E> next;
		Node<E> prev;
		
		public Node(E data) {
			this.data = data;
			this.next = this.prev = null;
		}
	}
	public static void main(String args []) {
		myDeque<Integer> md = new myDeque<>();
		md.addToHead(11);
		md.addToHead(14);
		md.addToHead(43);
		System.out.println(md.removeLast());
		System.out.println(md.removeLast());		
		
		
	}

}
