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
	    Queue queue = new Queue(5);
	    queue.enqueue(5);
	    queue.enqueue(6);
	    queue.enqueue(7);
	    queue.enqueue(8);
	    queue.display();
	    int ele = queue.getFront();
	    System.out.println(ele != -1 ? "Front is " + ele : -1);
	    queue.dequeue();
	    queue.display();
	    queue.enqueue(9);
	    queue.display();
	    ele = queue.getRear();
	    System.out.println(ele != -1 ? "Front is " + ele : -1);
	    queue.dequeue();
	    queue.display();
	    queue.dequeue();
	    queue.display();
	    queue.dequeue();
	    queue.display();
	    queue.dequeue();
	    queue.display();
	    ele = queue.getRear();
	    System.out.println(ele != -1 ? "Front is " + ele : -1);
	}
}
