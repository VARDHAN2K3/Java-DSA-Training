import java.util.*;
class Node{
    int coef;
    int exp;
    Node next;
    Node(int coef, int exp){
        this.coef = coef;
        this.exp = exp;
        next = null;
    }
}
class Polynomial{
    Node head;
    void insert(int coef, int exp){
        Node newNode = new Node(coef, exp);
        if(head == null || head.exp < exp){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp != null && temp.next != null && temp.next.exp > exp)
            temp = temp.next;
        if(temp.next != null && temp.next.exp == exp){
            temp.next.coef += coef;
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void display(){
        if(head.coef == 0)
            head = head.next;
        if(head == null){
            System.out.println("Expression is not availble");
            return;
        }
        Node temp = head;
        while(temp != null){
            if(temp.coef != 0){
                if(temp.coef > 0 && temp != head)
                    System.out.print("+");
                System.out.print((temp.coef == 1 ? "" : temp.coef == -1 ? "-" : temp.coef) + 
                (temp.exp == 0 ? "" : (temp.exp == 1 ? "x" : "x^" + temp.exp)));
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
public class Main
{
    static void addPolynomials(Polynomial poly1, Polynomial poly2){
        Polynomial res = new Polynomial();
        Node p1 = poly1.head;
        Node p2 = poly2.head;
        while(p1 != null && p2 != null){
            if(p1.exp == p2.exp){
                int sum = p1.coef + p2.coef;
                res.insert(sum, p1.exp);
                p1 = p1.next;
                p2 = p2.next;
            }else if(p1.exp > p2.exp){
                res.insert(p1.coef, p1.exp);
                p1 = p1.next;
            }else{
                res.insert(p2.coef, p2.exp);
                p2 = p2.next;
            }
        }
        while(p1 != null){
            res.insert(p1.coef, p1.exp);
            p1 = p1.next;
        }
        while(p2 != null){
            res.insert(p2.coef, p2.exp);
            p2 = p2.next;
        }
        res.display();
    }
    static void subPolynomials(Polynomial poly1, Polynomial poly2){
        Polynomial res = new Polynomial();
        Node p1 = poly1.head;
        Node p2 = poly2.head;
        while(p1 != null && p2 != null){
            if(p1.exp == p2.exp){
                int sum = p1.coef - p2.coef;
                res.insert(sum, p1.exp);
                p1 = p1.next;
                p2 = p2.next;
            }else if(p1.exp > p2.exp){
                res.insert(p1.coef, p1.exp);
                p1 = p1.next;
            }else{
                res.insert(p2.coef, p2.exp);
                p2 = p2.next;
            }
        }
        while(p1 != null){
            res.insert(p1.coef, p1.exp);
            p1 = p1.next;
        }
        while(p2 != null){
            res.insert(p2.coef, p2.exp);
            p2 = p2.next;
        }
        res.display();
    }
	public static void main(String[] args) {
	   // CircularLinkedList cll = new CircularLinkedList();
	   // cll.insAtFront(10);
	   Polynomial p1 = new Polynomial();
	   p1.insert(-2,2);
	   // p1.insert(3,1);
	   p1.insert(4,1);
	   p1.insert(0,3);
	   p1.insert(6, 0);
	   p1.display();
	   Polynomial p2 = new Polynomial();
	   p2.insert(2,2);
	   p2.insert(4,1);
	   p2.insert(1, 0);
	   p2.display();
	   addPolynomials(p1,p2);
	   subPolynomials(p1, p2);
	}
}
