import java.util.NoSuchElementException;
import java.util.Scanner;

class myQueue<E>{
	
	private Node<E> last, first;
	
	public void add(E item) {
		Node<E> toAdd = new Node<>(item);
		
		if(first == null) {
			first = last = toAdd;
		}
		last.next = toAdd;
		last = last.next;
	}
	
	public E remove() {
		if(first == null) throw new NoSuchElementException();
		Node<E> toRemove = first;
		first = first.next;
		if(first == null) {
			last = null;
		}
		return toRemove.data;
		
	}
	
	public E peek() {
		if(first == null) throw new NoSuchElementException();
		return first.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void print() {
		Node<E> temp =first ;
		while(temp !=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static class Node<E>{
		E data;
		Node<E> next;
		public Node(E data){
			this.data = data;
			next = null;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		myQueue<Integer> queue = new myQueue<>();
		for(int i = 0 ; i< 5; i++) {
			queue.add(i);
		}
		for(int i = 0 ; i< 5; i++) {
			System.out.println(queue.remove());
		}
		sc.close();
//		queue.print();
		
	}
}