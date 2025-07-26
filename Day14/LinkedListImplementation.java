//import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    void insertAtBeg(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insertAtPos(int pos, int data) {
        if (pos < 1) {
            System.out.println("Invalid Position");
            return;
        }
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int cur = 1;
        while (temp != null && cur < pos - 1) {
            temp = temp.next;
            cur++;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void deleteFromBeg(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        head = head.next;
    }
    void deleteFromEnd(){
        if(head == null){
            System.out.println("Linked List is empty");
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
    void deleteAtPos(int pos){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        if(pos == 1){
            head = head.next;
            return;
        }
        int cur = 1;
        Node temp = head;
        while(temp != null && cur < pos - 1){
            temp = temp.next;
            cur++;
        }
        if(pos < 1 || temp == null){
            System.out.println("Invalid Position");
        }
        temp.next = temp.next.next;
    }
    void display() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtBeg(10);
        ll.insertAtBeg(20);
        ll.insertAtBeg(30);
        ll.insertAtEnd(50);
        ll.insertAtPos(2, 40);
        ll.display();
        ll.insertAtPos(6, 60);
        ll.display();
        ll.insertAtPos(1, 70);
        ll.display();
        ll.deleteFromBeg();
        ll.display();
        ll.deleteFromEnd();
        ll.display();
        ll.deleteAtPos(5);
        ll.display();
    }
}
