/*
 * You’re given the pointer to the head nodes of two linked lists. Compare the data in the nodes of the linked lists to check if they are equal. The lists are equal only if they have the same number of nodes and corresponding nodes contain the same data. Either head pointer given may be null meaning that the corresponding list is empty.

Input Format

You have to complete the int CompareLists(Node* headA, Node* headB) method which takes two arguments - the heads of the two linked lists to compare. You should NOT read any input from stdin/console.

The input is handled by the code in the editor and the format is as follows: The first line contains , the number of test cases. The format for each test case is as follows:

The first line contains an integer , denoting the number of elements in the first linked list.
The next  lines contain an integer each, denoting the elements of the first linked list.
The next line contains an integer , denoting the number of elements in the second linked list.
The next  lines contain an integer each, denoting the elements of the second linked list.

Constraints

, where  is the  element in the list.
Output Format

Compare the two linked lists and return 1 if the lists are equal. Otherwise, return 0. Do NOT print anything to stdout/console.

The output is handled by the code in the editor and it is as follows:

For each test case, in a new line, print  if the two lists are equal, else print .

Sample Input

2
2
1
2
1
1
2
1
2
2
1
2
Sample Output

0
1
 */


package DataStructuresQuestion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

	

	public class CompareTwoLinkedLists {
	    static class SinglyLinkedListNode {
	        public int data;
	        public SinglyLinkedListNode next;

	        public SinglyLinkedListNode(int nodeData) {
	            this.data = nodeData;
	            this.next = null;
	        }
	    }

	    static class SinglyLinkedList {
	        public SinglyLinkedListNode head;
	        public SinglyLinkedListNode tail;

	        public SinglyLinkedList() {
	            this.head = null;
	            this.tail = null;
	        }

	        public void insertNode(int nodeData) {
	            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

	            if (this.head == null) {
	                this.head = node;
	            } else {
	                this.tail.next = node;
	            }

	            this.tail = node;
	        }
	    }

	    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
	        while (node != null) {
	            bufferedWriter.write(String.valueOf(node.data));

	            node = node.next;

	            if (node != null) {
	                bufferedWriter.write(sep);
	            }
	        }
	    }

	    // Complete the compareLists function below.

	    /*
	     * For your reference:
	     *
	     * SinglyLinkedListNode {
	     *     int data;
	     *     SinglyLinkedListNode next;
	     * }
	     *
	     */
	    
//	    Answer
	    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
	         while (head1 != null && head2 != null) {
	                if (head1.data != head2.data)
	                    return false;

	                head1 = head1.next;
	                head2 = head2.next;

	            }
	    
	    
	            if(head1==null && head2!=null)
	                return false;
	    
	            if(head1!=null && head2==null)
	                return false;
	            
	            return true;
	  


	    }
//	    

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int tests = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int testsItr = 0; testsItr < tests; testsItr++) {
	            SinglyLinkedList llist1 = new SinglyLinkedList();

	            int llist1Count = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int i = 0; i < llist1Count; i++) {
	                int llist1Item = scanner.nextInt();
	                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	                llist1.insertNode(llist1Item);
	            }
	          
	          	SinglyLinkedList llist2 = new SinglyLinkedList();

	            int llist2Count = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int i = 0; i < llist2Count; i++) {
	                int llist2Item = scanner.nextInt();
	                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	                llist2.insertNode(llist2Item);
	            }

	            boolean result = compareLists(llist1.head, llist2.head);

	            bufferedWriter.write(String.valueOf(result ? 1 : 0));
	            bufferedWriter.newLine();
	        }

	        bufferedWriter.close();

	        scanner.close();
	    }
	}

