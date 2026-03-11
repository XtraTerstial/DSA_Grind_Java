package CodingQuestions.LinkedList;
class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class Q1_FindMiddleOfLL {
    static int findMiddle(Node a){
        Node slow = a;
        Node fast = a;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
    static void main() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
//        Node g = new Node(7);
        a.next = b; b.next = c;
        c.next = d; d.next = e;
        e.next = f; //f.next = g;
//        g.next = null;
        System.out.println("Middle :"+findMiddle(a));

    }
}
