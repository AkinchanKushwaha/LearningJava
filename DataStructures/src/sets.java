import java.util.HashSet;
import java.util.Set;

public class sets {

	public static void main(String[] args) {
/* The set interface of the Java collections framework provides
 * the features of the mathematical set in Java. It extends the
 * Collection interface. Unnlike the list interface, sets cannot 
 * contain duplicate elements.
 * -HashSet
 * -LinkedHashSet
 * -EnumSet
 * -TreeSet
 * 
 * 
 * ===Methods of Set===
 * 1. add(element)
 * 2. addAll(Collection)   "Union"
 * 3. remove(element)
 * 4. retain(element)
 * 5. removeAll()
 * 6. retainAll()		"Intersection"
 * 7. clear()
 * 8. size()
 * 9. contains()
 * 10. containsAll()		"Subset"
 * 11. isEmpty()
 * 12. toArray()
 * 
 */
		Set<String> fruits = new HashSet<>();
		fruits.add("apple"); //add method returns a boolean.
		fruits.add("banana");
		fruits.add("kiwi");
		
		System.out.println(fruits.add("kiwi"));
		System.out.println(fruits);
		
		


	}

}
