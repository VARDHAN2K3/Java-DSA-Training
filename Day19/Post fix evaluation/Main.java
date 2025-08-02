import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Stack<Integer> stack = new Stack<>();
	    String postExp = "654*+7-";
	    for(char ch : postExp.toCharArray()){
	        if(Character.isDigit(ch))
	            stack.push(ch-'0');
	        else{
	            int b = stack.pop();
	            int a = stack.pop();
	            if(ch == '+')
	                stack.push(a+b);
	            else if(ch == '-')
	                stack.push(a-b);
	            else if(ch == '*')
	                stack.push(a*b);
	            else if(ch == '/')
	                stack.push(a/b);
	            else if(ch == '%')
	                stack.push(a%b);
	        }
	    }
	    System.out.println(stack.peek());
	}
}
