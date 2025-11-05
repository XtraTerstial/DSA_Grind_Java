package Linked_List.start;

class Node{
    Node next;
    int val;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}
public class ListNodeClass {
    static void printLl(Node head){
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    static void displayRecursively(Node head){
        if(head==null) return; //base case
        System.out.println(head.val);
        displayRecursively(head.next);
    }
    static void displayRevRecursively(Node head){
        if(head==null) return; //base case
        displayRevRecursively(head.next);
        System.out.println(head.val);
    }
    static void main() {
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        Node e = new Node(60);
        a.next = b; b.next = c; c.next = d; d.next = e;
        Node temp = a;
//        System.out.println(temp.next.val);
        printLl(a);

    }
}
