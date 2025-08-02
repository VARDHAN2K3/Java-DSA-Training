import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String infix = "A^B*C/(D*E-F)";
	    Map<Character, Integer> symbols = Map.of('+', 0, '-', 0, '*', 1, '/', 1, '^', 2);
	    StringBuilder postfix = new StringBuilder();
	    Stack<Character> stack = new Stack<>();
	    for(char ch : infix.toCharArray()){
	        if(symbols.containsKey(ch)){
	            if(stack.isEmpty()){
	                stack.push(ch);
	                continue;
	            }
	            if(stack.peek() == '(' || symbols.get(stack.peek()) < symbols.get(ch)){
	                stack.push(ch);
	            }else{
	                postfix.append(stack.pop());
	                stack.push(ch);
	            }
	        }
	        else if(ch == '(') 
	            stack.push(ch);
	        else if(ch == ')'){
	            while(!stack.isEmpty() && stack.peek() != '(')
	                postfix.append(stack.pop());
	            if(stack.peek() == '(')
	                stack.pop();
	        }
	        else 
	            postfix.append(ch);
	    }
	    while(!stack.isEmpty())
	        postfix.append(stack.pop());
	    System.out.println(postfix.toString());
	}
}
