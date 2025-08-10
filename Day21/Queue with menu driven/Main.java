import java.util.*;
class Queue{
    int size;
    int[] queue;
    int front = -1, rear = -1;
    Queue(int size){
        this.size = size;
        queue = new int[size];
    }
    void enqueue(int data){
        if(rear == size-1){
            System.out.println("Queue is full");
            return;
        }
        if(front == -1)
            front++;
        queue[++rear] = data;
    }
    void dequeue(){
        if(front == -1){
            System.out.println("Queue is Empty");
            return;
        }
        if(front == rear){
            front = rear = -1;
            return;
        }
        front++;
    }
    void display(){
        if(front == -1 || rear == -1){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }
    int getFront(){
        if(front == -1)
            return -1;
        return queue[front];
    }
    int getRear(){
        if(rear == -1)
            return -1;
        return queue[rear];
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    Queue queue = new Queue(5);
	    int ch = 0;
	    do{
	        System.out.println("===Queues===");
	        System.out.println("1. Enqueue");
	        System.out.println("2. Dequeue");
	        System.out.println("3. Get First Element");
	        System.out.println("4. Get Last Element");
	        System.out.println("5. Display");
	        System.out.println("6. Exit");
	        ch = s.nextInt();
	        int ele = -1;
	        switch(ch){
	            case 1:
	                System.out.print("Enter Element: ");
	                queue.enqueue(s.nextInt());
	                break;
	            case 2:
	                queue.dequeue();
	                break;
	            case 5:
	                queue.display();
	                break;
	            case 3:
	                ele = queue.getFront();
	                System.out.println(ele != -1 ? "Front is: " + ele : -1);
	                break;
	            case 4:
	                ele = queue.getFront();
	                System.out.println(ele != -1 ? "Rear is: " + ele : -1);
	                break;
	            case 6:
	                System.out.println("Exiting Program");
	                break;
	        }
	    }while(ch != 6);
	}
}
