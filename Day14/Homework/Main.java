package Homework;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){}
    void insertAtBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
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
        temp.next = newNode;
    }
    void inserAtSpecPos(int pos, int data){
        Node newNode = new Node(data);
        if(pos == 1){
            insertAtBegin(data);
            System.out.println("\n" + data + " is inserted at position " + pos);
            return;
        }
        Node temp = head;
        int cur = 1;
        while(temp != null && cur < pos -1){
            temp = temp.next;
            cur++;
        }
        if(pos < 1 || temp == null){
            System.out.println("\nInvalid Position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("\n" + data + " is inserted at position " + pos);
    }
    void deleteFromBegin(){
        if(head == null){
            System.out.println("\nList is Empty");
            return;
        }
        Node temp = head;
        head = temp.next;
        temp.next = null;
        System.out.println("\nDeleted From Beginning of the List");
    }
    void deleteFromEnd(){
        if(head == null){
            System.out.println("\nList is Empty");
            return;
        }
        if(head.next == null){
            head = null;
            System.out.println("\nDeleted From end of the List");
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("\nDeleted From end of the List");
    }
    void deleteFromSpecPos(int pos){
        if(head == null){
            System.out.println("\nList is Empty");
            return;
        }
        Node temp = head;
        if(pos == 1){
            head = temp.next;
            temp.next = null;
            System.out.println("\nDeleted From the Position: " + pos);
            return;
        }
        int cur = 1;
        while(temp != null && cur < pos - 1){
            temp = temp.next;
            cur++;
        }
        if(pos < 1 || temp == null || temp.next == null){
            System.out.println("\nInvalid Positon");
            return;
        }
        Node delNode = temp.next;
        temp.next = delNode.next;
        delNode.next = null;
        System.out.println("\nDeleted From the Position: " + pos);
    }
    void display(){
        if(head == null){
            System.out.println("\nList is empty");
            return;
        }
        Node temp = head;
        System.out.print("\nHead-->");
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("Null\n");
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int choice = 0;
        do{
            System.out.println("\t====Linked List====");
            System.out.println("1. Insert At beginning");
            System.out.println("2. Insert At End");
            System.out.println("3. Insert At Specific Position");
            System.out.println("4. Delete From beginning");
            System.out.println("5. Delete From End");
            System.out.println("6. Delete From Specific Position");
            System.out.println("7. Display All Elements");
            System.out.println("8. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            int data = -1, pos = -1;
            switch (choice){
                case 1 :
                    System.out.print("Enter Value:");
                    data = sc.nextInt();
                    list.insertAtBegin(data);
                    System.out.println("\n" + data + " is inserted at beginning");
                    break;
                case 2 :
                    System.out.print("Enter Value: ");
                    data = sc.nextInt();
                    list.insertAtEnd(data);
                    System.out.println("\n" + data + " is inserted at end");
                    break;
                case 3 :
                    System.out.print("Enter Position and Value: ");
                    pos = sc.nextInt();
                    data = sc.nextInt();
                    list.inserAtSpecPos(pos, data);
                    break;
                case 4 :
                    list.deleteFromBegin();
                    break;
                case 5 :
                    list.deleteFromEnd();
                    break;
                case 6 :
                    System.out.print("Enter Position to delete: ");
                    pos = sc.nextInt();
                    list.deleteFromSpecPos(pos);
                    break;
                case 7 :
                    list.display();
                    break;
                case 8:
                    System.out.println("\nExited");
                    break;
                default :
                    System.out.println("\nInvalid Choice");
            }
            System.out.println();
        }while(choice != 8);
        sc.close();
    }
}
