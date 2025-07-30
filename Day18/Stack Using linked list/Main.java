class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class Stack{
    Node top;
    void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    void pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(top.data + " is delete");
        top = top.next;
    }
    void peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("peek element is: " + top.data);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Stack stack = new Stack();
	    stack.push(10);
	    stack.push(20);
	    stack.peek();
	    stack.pop();
	    stack.peek();
	}
}
