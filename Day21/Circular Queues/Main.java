class CircularQueue{
    int size, front, rear;
    int[] queue;
    CircularQueue(int size){
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }
    void enqueue(int data){
        if((rear+1)%size == front){
            System.out.println("Queue is Full");
            return;
        }
        if(front == -1)
            front = 0;
        rear = (rear+1)%size;
        queue[rear] = data;
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
        front = (front+1)%size;
    }
    
}
public class Main
{
	public static void main(String[] args) {
	    System.out.println(-1%5);
	}
}
