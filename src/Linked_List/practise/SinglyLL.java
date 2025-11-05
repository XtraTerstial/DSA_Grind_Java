package Linked_List.practise;

//Node definning
class ListNode {
    ListNode next;
    int val;

    ListNode(int val ) {
        this.val = val;
        this.next = null; // Good practice to explicitly set to null
    }
}

//Implementing Singly linked list
class SLL{
    ListNode head;
    ListNode tail;
    int size = 0;

    //Helper method to print the list with arrows
    void print() {
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val);
            if(temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println(" (NULL)");
    }

    //Insert a element in tail of LL
    void insertAtTail(int val) {
        ListNode temp = new ListNode(val);
        if(head == null){
            head = tail = temp; //LL is empty
        } else {
            // FIX: Your original code had a bug here.
            // The first time it hits the else block, 'tail.next' is null, so it works.
            // But if 'head' was null, you skip 'tail.next = temp', which is correct.
            // BUT: when head is NOT null, you must use the 'else' block
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    //Insert a element in head of LL
    void insertAtHead(int val) {
        ListNode temp = new ListNode(val);
        if(head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insertAnyWhere(int position, int val) throws Exception{
        // Adjusting positions for 0-based index vs 1-based position for clarity
        if(position < 1) { // 1-based position check
            throw new Exception("Position must be 1 or greater.");
        }
        if(position == 1) {
            insertAtHead(val);
            return;
        }
        if(position > size + 1) {
            throw new Exception("Index/position " +position+" don't exist");
        }
        if (position == size + 1) { // Correctly handles insertion at the very end
            insertAtTail(val);
            return;
        }

        ListNode temp = new ListNode(val);
        ListNode current = head;
        // Traverse to the node *before* the insertion point
        for(int i = 1; i < position - 1; i++){
            current = current.next;
        }

        // At this point, 'current' is the node *before* the insertion point
        temp.next = current.next;
        current.next = temp;
        size++;
    }

    int getElement(int position) throws Exception{
        // Corrected bounds check for 1-based position (1 to size)
        if(position > size || position < 1) {
            throw new Exception("Entered position/idx " +position+ " don't exists");
        }
        ListNode current = head;
        // Traverse to the node at the specified position
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        return current.val;
    }

    void replace(int position, int val) throws Exception {
        if(position > size || position < 1) {
            throw new Exception("Cannot replace. Position " +position+ " don't exists");
        }
        ListNode current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        current.val = val;
    }

    void delete(int position) throws Exception {
        if(position > size || position < 1) {
            throw new Exception("Cannot delete. Position " +position+ " don't exists");
        }

        // Case 1: Delete Head (position 1)
        if (position == 1) {
            head = head.next;
            if (head == null) { // If the list becomes empty
                tail = null;
            }
            size--;
            return;
        }

        // Traverse to the node *before* the one to be deleted
        ListNode current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }

        // Case 2: Delete Tail (position == size)
        if (position == size) {
            current.next = null;
            tail = current; // 'current' is the new tail
        }
        // Case 3: Delete Middle Node
        else {
            // 'current' is the node before the one to be deleted (current.next)
            current.next = current.next.next;
        }

        // NOTE: Your original 'delete' logic was incorrect for SLLs.
        // It copied the next node's value and skipped the next node, which doesn't work
        // for deleting the tail, and is not the standard way to delete a node.
        size--;
    }

    void size() {
        System.out.println("Size of LL is: "+size);
    }

}


public class SinglyLL {
    public static void main(String[] args) {
        SLL list = new SLL();

        System.out.println("--- 🚀 Initializing Linked List ---");

        // 1. Insert at Tail
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        System.out.print("After 3x insertAtTail: ");
        list.print(); // Output: 10 -> 20 -> 30 (NULL)
        list.size();

        // 2. Insert at Head
        list.insertAtHead(5);
        list.insertAtHead(1);
        System.out.print("After 2x insertAtHead: ");
        list.print(); // Output: 1 -> 5 -> 10 -> 20 -> 30 (NULL)
        list.size(); // Size: 5

        System.out.println("\n--- 🛠️ Modification Methods ---");
        try {
            // 3. Insert Anywhere (Position 3)
            list.insertAnyWhere(3, 15); // Insert 15 at position 3 (between 5 and 10)
            System.out.print("After insertAnyWhere(3, 15): ");
            list.print(); // Output: 1 -> 5 -> 15 -> 10 -> 20 -> 30 (NULL)

            // 4. Get Element (Position 4)
            int val = list.getElement(4);
            System.out.println("Element at position 4 is: " + val); // Output: 10

            // 5. Replace Element (Position 2)
            list.replace(2, 6); // Replace 5 with 6
            System.out.print("After replace(2, 6): ");
            list.print(); // Output: 1 -> 6 -> 15 -> 10 -> 20 -> 30 (NULL)

            // 6. Delete Head (Position 1)
            list.delete(1);
            System.out.print("After delete(1) [Head]: ");
            list.print(); // Output: 6 -> 15 -> 10 -> 20 -> 30 (NULL)
            list.size(); // Size: 5

            // 7. Delete Middle (Position 3)
            list.delete(3); // Delete 10
            System.out.print("After delete(3) [Middle]: ");
            list.print(); // Output: 6 -> 15 -> 20 -> 30 (NULL)

            // 8. Delete Tail (Position 4 - new size is 4)
            list.delete(4);
            System.out.print("After delete(4) [Tail]: ");
            list.print(); // Output: 6 -> 15 -> 20 (NULL)
            list.size(); // Size: 3

        } catch (Exception e) {
            System.err.println("\nError encountered: " + e.getMessage());
        }

        System.out.println("\n--- ⚠️ Testing Edge Cases ---");
        try {
            list.insertAnyWhere(50, 999); // Should throw an exception
        } catch (Exception e) {
            System.err.println("Caught expected error: " + e.getMessage());
        }

        try {
            list.delete(0); // Should throw an exception
        } catch (Exception e) {
            System.err.println("Caught expected error: " + e.getMessage());
        }

        System.out.print("Final List state: ");
        list.print(); // Output: 6 -> 15 -> 20 (NULL)
    }
}