import java.util.Stack;
import java.util.Scanner;

class StackOperations{
    Stack<Integer> stack = new Stack<>();
    void push(int val){
        stack.push(val);
        System.out.println("Pushed: "+ val);
    }
    void pop(){
        if(stack.isEmpty())
            System.out.println("Stack is Empty");
        else
            System.out.println("Popped: "+ stack.pop());
    }
    void peek(){
        if(stack.isEmpty())
            System.out.println("Stack is Empty");
        else
            System.out.println("Peek: " + stack.peek());
    }
    void display(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        for(int i = stack.size()-1; i >= 0; i--)
            System.out.print(stack.get(i) + " ");
        System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
	    StackOperations so = new StackOperations();
	    so.push(20);
	    so.push(30);
	    so.peek();
	    so.push(10);
	    so.display();
	    so.pop();
	    so.peek();
	    so.display();
	    so.pop();
	    so.pop();
	    so.display();
	}
}
