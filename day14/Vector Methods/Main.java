import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;
public class Main
{
	public static void main(String[] args) {
	    Vector<String> vector = new Vector<>();
	    
	    vector.add("Apple");
	    vector.add("Banana");
	    vector.add("Cherry");
	    vector.add("Orange");
	    
	    System.out.println(vector);
	    
	    vector.add(1, "Ball");
	    
	    System.out.println(vector);
	    
	    System.out.println(vector.get(2));
	    
	    vector.set(2, "Brinjal");
	    System.out.println(vector);
	    
	    vector.remove(1);
	    System.out.println(vector);
	    
	    vector.remove("Cherry");
	    System.out.println(vector);
	    
	    System.out.println(vector.contains("Orange"));
	    
	    System.out.println(vector.indexOf("Apple"));
	    System.out.println(vector.lastIndexOf("Apple"));
	    
	    System.out.println(vector.firstElement());
	    System.out.println(vector.lastElement());
	    
	    System.out.println(vector.size());
	    
	    System.out.println(vector.isEmpty());
	    
	    Iterator<String> it = vector.iterator();
	    while(it.hasNext())
	        System.out.print(it.next() + " ");
	   System.out.println();
	   
	   // Enumeration
	   Enumeration<String> en = vector.elements();
	   while(en.hasMoreElements())
	        System.out.print(en.nextElement() + " ");
	   System.out.println();
	   
	   Object[] arr = vector.toArray();
	   System.out.print("Array: ");
	   for(Object a : arr)
	        System.out.print(a + " ");
	   System.out.println();
	}
}