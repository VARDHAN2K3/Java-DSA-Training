import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Stack<Character> stack = new Stack<>();
	    String str = "Vardhan";
	    for(char ch : str.toCharArray())
	        stack.push(ch);
	    for(int i = stack.size()-1; i >= 0; i--)
	        System.out.print(stack.get(i));
	    System.out.println();
	}
}
