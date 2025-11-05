package Linked_List.start;

/*
* Make a node class first
* then make a user defined data structure containing a head and tail and a integer variable to track size
* insertAtHead
* insertAtTail
* inserAnyWhere
* getElement
* replaceElement
* delete
* size print
* printing ll
*/

class SinglyLinkedList{ //user defined data structure
    Node tail;
    Node head;
    int size = 0;

    void insertAtTail(int val){
        Node temp = new Node(val);
        if (head == null){
            head = tail = temp; //LL is empty
        }
//        else { // insertion using tail
//            tail.next = temp;
//            tail = temp;
//        }
        else { //insertion using head
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = temp;
        }
        size++;
    }
    void insertAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null){
            head = tail = newNode; //LL is empty
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    void insertAnyWhere(int position, int val) throws Exception{
        if(position == 0) insertAtHead(val);
        if(position == size-1) insertAtTail(val);
        if(position > size) throw new Exception("Entered position/idx " +position+ " don't exists");
        Node current = head;
        Node temp = new Node(val);
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        temp.next = current.next;
        current.next = temp;
        size++;
    }
    int getElement(int position) throws Exception{
//        int element = 0;
        if(position > size || position < 0) throw new Exception("Entered position/idx " +position+ " don't exists");
        Node current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        return current.val;
    }
    void replace(int position, int val){
        Node current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        current.val = val;
    }
    void delete(int position) {
        Node current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        current.val = current.next.val;
        current.next = current.next.next;
    }
    void size(){
        System.out.println("Size: "+size);
    }
    void printList() {
        Node current = head;
        while(current != null){
            System.out.print(current.val+" ");
            current = current.next;
        }

    }
}

public class ImplementationLL {
    static void main() throws Exception {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtTail(12);
        list.insertAtTail(13);
        list.insertAtTail(14);
        list.insertAtTail(15);
        list.printList();
        System.out.println();
        list.insertAtHead(11);
        list.insertAtTail(16);
        list.insertAnyWhere(2, 125);
        list.printList();
        System.out.println();
        System.out.println("Current Size of SLL is: "+list.size);
        System.out.println(list.getElement(2));
        list.replace(3, 0);
        list.printList();
        System.out.println();
        list.delete(3);
        list.printList();
    }
}
