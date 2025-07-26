import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Map<Integer, String> map = new HashMap<>();
	    
	    map.put(1, "Apple");
	    map.put(2, "Banana");
	    map.put(3, "Cherry");
	    map.put(4, "Orange");
	    map.put(5, "Mango");
	    map.put(5, "Cucumber");
	    System.out.println(map);
	    
	    Map<Integer, String> anotherMap = new HashMap<>();
	    anotherMap.put(6, "Kiwi");
	    anotherMap.put(7, "Grapes");
	    System.out.println(anotherMap);
	    anotherMap.putAll(map);
	    System.out.println(anotherMap);
	    
	    System.out.println(map.get(3));
	    
	    map.remove(3);
	    System.out.println(map);
	    
	    System.out.println(map.containsKey(1));
	    System.out.println(map.containsValue("Apple"));
	    
	    System.out.println(map.size());
	    
	    System.out.println(map.isEmpty());
	    
	    Set<Integer> keys = map.keySet();
	    System.out.println(keys);
	    
	    Collection<String> values = map.values();
	    System.out.println(values);
	    
	    Set<Map.Entry<Integer, String>> entries = map.entrySet();
	    System.out.println(entries);
	    for(Map.Entry<Integer, String> e : entries)
	        System.out.println(e.getKey() + ": " + e.getValue());
	    
	    map.replace(4, "Banana");
	    System.out.println(map);
	    map.clear();
	    System.out.println(map);
	    System.out.println(map.isEmpty());
	}
}