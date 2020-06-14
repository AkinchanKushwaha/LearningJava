import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		
// HashMap is a part of Java's collection. It provides the basic
// implementation of the Map interface of Java. It stored the data in 
// (key,value) pairs.
		Map<String, Integer> numbers = new HashMap<>();
		numbers.put("one",1);
		numbers.put("two",2);
		numbers.put("three",3);
		
		
		numbers.putIfAbsent("one", 10);
		
		System.out.println(numbers.get("two"));
		System.out.println(numbers.containsKey("one"));
		numbers.remove("two");

		System.out.println(numbers);
		System.out.println(numbers.keySet());
		System.out.println(numbers.values());
		System.out.println(numbers.entrySet());
		
		Set<Entry<String,Integer>> entries = numbers.entrySet();
		
		
		for(Entry<String,Integer> entry : entries) {
			entry.setValue(entry.getValue()*100);
			
		}
		System.out.println(numbers);
		
		
/*===Methods of Map====
 * put(k,v)
 * putAll()
 * putIfAbsent(k,v)
 * get(k)
 * getOrDefault(k, defaultValue)
 * containsKey(k)
 * containsValue(v)
 * replace(k,v)
 * replace(k,oldValue,newValue)
 * remove(k)
 * remove(k,v)
 * keySet()
 * values()
 * entrySet() 
 */
		
/*       Internal working of HashMap <---Important.

 * HashMap uses an array table to store its Key Value pairs.
 * Each element of the array holds the head of a linkedList to
 * avoid collision. The hash of every key is calculated and the 
 * elements are placed in the array using the hash function.
 * 
 * The default capacity is kept at 16 and the load factor  at 0.75.
 *		
 */
	}

}
