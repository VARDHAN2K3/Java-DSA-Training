import java.util.LinkedList;
import java.util.Iterator;

public class Main
{
	public static void main(String[] args) {
	    LinkedList<String> li = new LinkedList<>();
	    
	    //Add 
	    li.add("Apple");
	    li.add("Banana");
	    li.add("Cherry");
	    li.add("Apple");
	    
	    System.out.println(li);
	    
	    //insert
	    li.add(1, "mango");
	    System.out.println(li);
	    
	    //addFirst
	    li.addFirst("Aeroplane");
	    System.out.println(li);
	    
	    //addLast
	    li.addLast("Zebra");
	    System.out.println(li);
	    li.addLast("Apple");
	    
	    //get()
	    System.out.println(li.get(2));
	    
	    //getFirst getLast
	    System.out.println(li.getFirst() + " " + li.getLast());
	    
	    //set 
	    li.set(2, "Ball");
	    System.out.println(li);
	    
	    //remove
	    li.remove(2);
	    System.out.println(li);
	    
	    //remove Object
	    li.remove("Apple");
	    System.out.println(li);
	    
	    //remove first and last 
	    li.removeFirst();
	    System.out.println(li);
	    li.removeLast();
	    System.out.println(li);
	    
	    //contains 
	    System.out.println(li.contains("Apple"));
	    
	    //indexOf and lastIndexOf
	    System.out.println(li.indexOf("Banana") + " " + li.lastIndexOf("Banana"));
	    
	    //size 
	    System.out.println(li.size());
	    
	    //isEmpty
	    System.out.println(li.isEmpty());
	    
	    //iterator
	    Iterator<String> it = li.iterator();
	    while(it.hasNext()){
	        System.out.print(it.next() + " ");
	    }
	    System.out.println();
	    //Descending iterator 
	    it = li.descendingIterator();
	    while(it.hasNext()){
	        System.out.print(it.next() + " ");
	    }
	    System.out.println();
	    
	    //peek
	    System.out.println(li.peek());
	    
	    //poll
	    System.out.println(li.poll());
	    System.out.println(li);
	    
	    //offer offerFirst offerLast
	    li.offer("Apple");
	    li.offerFirst("Orange");
	    li.offerLast("Mango");
	    System.out.println(li);
	    
	    //toArray()
	    Object[] arr = li.toArray();
	    System.out.print("Array Version: ");
	    for(Object a : arr)
	        System.out.print(a + " ");
	    System.out.println();
	    
	    //clear 
	    li.clear();
	    System.out.println(li);
	}
}
