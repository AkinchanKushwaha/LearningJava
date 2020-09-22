
public class myCircularLinkedList{
	
	public static void main(String[] args) {
		myCircularLinkedList cll = new myCircularLinkedList();
		for(int i = 0 ; i<5 ;i++) {
			cll.add(i);
		}
		System.out.println(cll.contains(9));
		cll.print();
	}
	
	
	
	
	private Node head;
	private Node tail;
	
	public void print() {
	    Node temp = head;
	 
	    if (head != null) {
	        do {
	            System.out.println(temp.data + " ");
	            temp = temp.next;
	        } while (temp != head);
	    }
	}
	
	public void add(int data) {
	    Node toAdd = new Node(data);
	 
	    if (head == null) {
	        head = toAdd;
	    } else {
	        tail.next = toAdd;
	    }
	 
	    tail = toAdd;
	    tail.next = head;
	}
	
	public void delete(int data) {
	    Node temp = head;
	 
	    if (head != null) {
	        if (temp.data == data) {
	            head = head.next;
	            tail.next = head;
	        } else {
	            do {
	                Node next = temp.next;
	                if (next.data == data) {
	                    temp.next = next.next;
	                    break;
	                }
	                temp = temp.next;
	            } while (temp != head);
	        }
	    }
	}
	
	public boolean contains(int data) {
	    Node temp = head;
	 
	    if (head == null) {
	        return false;
	    } else {
	        do {
	            if (temp.data == data) {
	                return true;
	            }
	            temp = temp.next;
	        } while (temp != head);
	        return false;
	    }
	}
	
	
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
}