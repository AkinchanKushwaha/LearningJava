import java.util.HashSet;
import java.util.Set;

public class HashCodeAndEquals {
	public static void main(String[] args) {
		pen pen1 = new pen(10, "blue");
		pen pen2 = new pen(10, "blue");
		
		System.out.println(pen1);
		System.out.println(pen2);
		
		Set<pen> pens = new HashSet<>();
		pens.add(pen1);
		pens.add(pen2);
		System.out.println(pens);
	}
}

/*=====IMPORTANT POINTS=====
 * 1.Always use same attributes of an objext to generate hashCode() and equals() both.
 * 2.equals() must be consistent.(if the objects are not modified, the it must keep returning the same value.)
 * 3.Whenever a.equals(b), the a.hashCode() must be same as b.hashCode();
 * 4.If you override one, the you should override the other.
 */
class pen{
	int price;
	String color;
	public pen(int price,String color){
		this.price = price;
		this.color = color;
	}
	@Override
	public boolean equals(Object obj) {
		pen that = (pen) obj; 
		boolean isEqual = this.price == that.price &&
				this.color.equals(that.color);
		return isEqual;
		}
	@Override
	public int hashCode() {
		return price + color.hashCode();
	}	
/* The Contract between equals() and hashCode() is: 
 * 1. If two objects are equal, then they must have the same hash code.
 * 2. If two objects have the same hash code, they may or may not be equal.
 * 		(due to collision)
 * 
 * Source--> Generate hashCode() and equals(). To generate these methods automatically.
 */
}

