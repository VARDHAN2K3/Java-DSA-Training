class Stack{
    private int top;
    private int size;
    private int[] stack;
    Stack(int size){
        top = -1;
        this.size = size;
        stack = new int[size];
    }
    void push(int data){
        if(top == size -1){
            System.out.println("Stack is overflow");
            return;
        }
        stack[++top] = data;
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return;
        }
        System.out.println(stack[top--] + " Popped");
    }
    void peek(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return;
        }
        System.out.println(stack[top]);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Stack stack = new Stack(5);
	    stack.push(1);
	    stack.push(2);
	    stack.peek();
	    stack.push(3);
	    stack.push(4);
	    stack.push(5);
	    stack.pop();
	    stack.pop();
	    stack.peek();
	}
}
