
import java.util.EmptyStackException;
import java.util.Scanner;

public class MyStackWithoutUsingLinkedList<E>{
	
	private int size = 0 ; 
	private Node<E> top;
	
	public E pop() {
		if(top == null) throw new EmptyStackException();
		E item = top.data;
		top = top.next;
		size--;
		return item;
	}
	
	public void push(E data) {
		Node<E> toAdd = new Node<>(data);	
		toAdd.next = top;
		top = toAdd;
		size++;
	}
	public E peek() {
		if(top == null) throw new EmptyStackException();
		
		return top.data;
	}
	
	public int size() {
		return size+1;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	
	
	public static class Node<E>{
		E data;
		Node<E> next;
		public Node(E data) {
			this.data = data;
		}
		
		
	}
	public static void main(String args[]) {
		MyStackWithoutUsingLinkedList<Integer> ms = new MyStackWithoutUsingLinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i= 0 ; i<1 ; i++) {
			ms.push(i);
		}
		
		System.out.println(ms.peek());
		System.out.println(ms.pop());
		System.out.println(ms.size());
		System.out.println(ms.isEmpty());
		

		
	}
	
}
