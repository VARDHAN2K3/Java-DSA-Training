import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Set<Integer> set = new HashSet<>();
	    
	    set.add(10);
	    set.add(20);
	    set.add(30);
	    set.add(20);
	    set.add(40);
	    set.add(12);
	    System.out.println(set);
	    
	    set.remove(30);
	    System.out.println(set);
	    
	    System.out.println(set.contains(20));
	    
	    Iterator<Integer> it = set.iterator();
	    while(it.hasNext())
	        System.out.print(it.next() + " ");
	    System.out.println();
	    
	    Object[] arr = set.toArray();
	    for(Object a : arr)
	        System.out.print(a + " ");
	    System.out.println();
	}
}