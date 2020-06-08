
public class MyStack <E>{
	private myLinkedList<E> ll = new myLinkedList<>();
	void push(E e) {
		ll.add(e);
		
	}
	E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Popping from the empy list is not allowed.");
		}
		return ll.removeLast();
		
	}
	E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Peeking from the empy list is not allowed.");
		}
		return ll.getLast();
		
	}
	public static void main(String[] args) throws Exception{
		MyStack<Integer> ms = new MyStack<>();
		ms.push(12);
		ms.push(43);
		
		int popped =ms.pop();
		System.out.println(popped);
		int peeked =ms.peek();
		System.out.println(peeked);
		
	}
}
