class Node {
    int data;
    Node next;
    Node previous;

    Node(int data) {
        this.data = data;
        next = null;
        previous = null;
    }
}

class DoublyLinkedList {
    Node head;

    void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }
    void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        newNode.previous = temp;
        temp.next = newNode;

    }
    void insertAtSpecPost(int pos, int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(pos == 1){
            newNode.next = head;
            head.next = newNode;
            head = newNode;
        }
        int cur = 1;
        while(cur < pos-1 && temp != null){
            temp = temp.next;
            cur++;
        }
        if(pos < 1 || temp == null || temp.next == null){
            System.out.println("Invalid Position");
            return;
        }
        Node nextNode = temp.next;
        temp.next = newNode;
        newNode.next = nextNode;
        nextNode.previous = newNode;
    }
    void deleteFromBegin(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }else if(head.next == null){
            head = null;
            return;
        }
        head = head.next;
        head.previous = null;
    }
    void deleteFromEnd(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    void deleteFromSpecPos(int pos){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(pos == 1){
            if(head.next == null){
                head = null;
                return;
            }
            head = head.next;
            head.previous = null;
            return;
        }
        Node temp = head;
        int cur = 1;
        while(cur < pos - 1 && temp != null){
            temp = temp.next;
            cur++;
        }
        if(pos < 1 || temp == null || temp.next == null){
            System.out.println("Invalid Position");
            return;
        }
        Node nextNode = temp.next.next;
        temp.next = nextNode;
        if(nextNode != null)
            nextNode.previous = temp;
    }
    void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data  + "-->");
            temp = temp.next;
        }
        System.out.print("NUll\n");
    }

    void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        Node tail = temp;
        while (tail != null) {
            System.out.print(tail.data + "-->");
            tail = tail.previous;
        }
        System.out.print("Null\n");
    }
}

public class Main {
    public static void main(String[] args){
        //DoublyLinkedList dll = new DoublyLinkedList();
        CircularLinkedList cll = new CircularLinkedList();
        cll.inserAtBegin(10);
        cll.display();
        cll.inserAtBegin(20);
        cll.display();
        cll.inserAtBegin(30);
        cll.display();
        cll.inserAtBegin(40);
        cll.display();
        cll.insertAtEnd(50);
        cll.display();
        cll.insertAtEnd(100);
        cll.display();
        cll.deleteFromBegin();
        cll.display();
        cll.deleteFromEnd();
        cll.display();
        /*/
        dll.insertAtBegin(10);
        dll.insertAtBegin(20);
        dll.insertAtBegin(30);
        dll.insertAtEnd(60);
        dll.insertAtBegin(40);
        dll.insertAtEnd(50);
        dll.insertAtSpecPost(4, 100);
        dll.displayForward();
        dll.deleteFromBegin();
        dll.displayForward();
        dll.deleteFromEnd();
        dll.displayForward();
        dll.deleteFromSpecPos(1);
        dll.displayForward();
        dll.deleteFromSpecPos(4);
        dll.displayForward();
        dll.deleteFromSpecPos(4);
        dll.displayForward();
        dll.deleteFromSpecPos(0);
        dll.deleteFromSpecPos(3);
        dll.displayForward();
        dll.deleteFromSpecPos(4);
        dll.displayBackward();*/
    }
}
