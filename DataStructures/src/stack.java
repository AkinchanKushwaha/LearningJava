import java.util.Stack;

public class stack {
	public static void main(String [] args) {
/* In stack, elements  are stored  and accessed in LAST IN FIRST OUT manner.
 * That is, elements  are added to the top of the stack and removed from the top of stack.
 * Stack class extends Vector class.
 */
		/* Methods of Stack
		 * 1.push()
		 * 2.pop()
		 * 3.peek()
		 * 4.search(E e)
		 * 5.empty()
		 */
		Stack<Integer> s = new Stack<>();
		s.push(12);
		s.push(23);
		s.push(53);
		
		int pop = s.pop();
		System.out.println(pop);
		
		int peek = s.peek();
		System.out.println(peek);
	}

}
