import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creating array list
        ArrayList<Integer> li = new ArrayList<>();
        
        //add method
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(50);
        li.add(60);
        System.out.println(li);
        
        //insert uses add(index, ele)
        li.add(2, 40);
        System.out.println(li);
        
        //get element
        System.out.println(li.get(1));
        
        //replace
        li.set(2, 30);
        li.set(3, 40);
        System.out.println(li);
        
        //remove element
        li.remove(3);
        System.out.println(li);
        
        //remove Object
        // // System.out.println(Integer.valueOf(20));
        li.remove(Integer.valueOf(20)); // Must use Integer.valueOf()
        System.out.println(li);
        
        //Contains
        System.out.println(li.contains(10));
        
        //size
        System.out.println(li.size());
        
        //isEmpty
        System.out.println(li.isEmpty());
        
        //iterator
        System.out.println("USing Iterator:");
        Iterator<Integer> it = li.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        
        //sublist()
        List<Integer> subLi = li.subList(0,2);
        System.out.println(subLi);
        
        //toArray
        Object[] arr = li.toArray();
        System.out.print("Array: ");
        for(Object a : arr)
            System.out.print(a + " ");
        
        //clear
        li.clear();
        System.out.println("\nAfter clear: " + li);
	}
}