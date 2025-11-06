package Linked_List.start;

class ListNode{
    ListNode next;
    int val;
    ListNode(int val){
        this.val = val;
    }
}

class LL {
    ListNode head;
    ListNode tail;
    int size = 0;

    void insertAtTail(int val) {
        ListNode temp = new ListNode(val);
        if(head == null) { //If list is empty
            head = tail = null;
        } else { //Insert at tail from tail
            tail.next = temp;
            tail = temp;
        }
//        else { //insert at tail from head
//           ListNode current = head;
//           while(current != null){
//               current = current.next;
//           }
//           current.next = temp;
//        }
        size++;
    }

    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if (head == null)
            head = tail = null;
        temp.next = head;
        head = temp;
        size++;
    }

    void insertAnyWhere(int position, int val){
        ListNode temp = new ListNode(val);
        ListNode current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        temp.next = current.next;
        current.next = temp;
        size++;
    }

    int getElement(int position){
        ListNode current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        return current.val;
    }
    void replace(int position, int val){
        ListNode current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        current.val = val;
    }

    void delete(int position) {
        ListNode current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        current.val = current.next.val;
        current.next = current.next.next;
        size--;
    }
    void size() {
        System.out.println("Size of Linked List is: "+size);
    }
    void print(){
        ListNode current = head;
        while(current!=null){
            System.out.println(current.val+" ");
            current = current.next;
        }
    }
}

public class Implementation2 {
    void main(){

    }
}
