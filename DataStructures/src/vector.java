import java.util.Vector;

public class vector {
	public static void main(String[] args) {
/*	The vector class synchronizes each individual operation.
 *  This means whenever we  want to perform  some operation on vectors, the vector class 
 *  automatically applies lock to that operation.
 *  It is recommended to use Array List  in place of vector  because vectors  are not thread safe
 *  and are less efficient.	
 */
		Vector<Integer> obj = new Vector<>();
		obj.add(5);
		System.out.println(obj);
	}

}
