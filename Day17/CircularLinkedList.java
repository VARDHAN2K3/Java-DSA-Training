class CircularNode{
    int data;
    CircularNode next;
    CircularNode(int data){
        this.data = data;
        next = this;
    }
}
public class CircularLinkedList {
    CircularNode head;
    void inserAtBegin(int data){
        CircularNode newNode = new CircularNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        CircularNode temp = head;
        while(temp.next != head)
            temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
        head = newNode;
    }
    void insertAtEnd(int data){
        CircularNode newNode = new CircularNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        CircularNode temp = head;
        while(temp.next != head)
            temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }
    void deleteFromBegin(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == head){
            head = null;
            return;
        }
        CircularNode temp = head;
        while(temp.next != head)
            temp = temp.next;
        head = head.next;
        temp.next = head;
    }
    void deleteFromEnd(){
        if(head == null || head.next == head){
            deleteFromBegin();
            return;
        }
        CircularNode temp = head;
        while(temp.next.next != head)
            temp = temp.next;
        temp.next.next = null;
        temp.next = head;
    }
    void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        CircularNode temp = head;
        do{
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }while(temp!= head);
        System.out.print("Null\n");
    }
}
