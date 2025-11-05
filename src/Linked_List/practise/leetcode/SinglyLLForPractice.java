package Linked_List.practise.leetcode;

// Minimal Linked List Structure (Focus on Head for LeetCode)
class PracticeSLL{
    ListNode head;

    // Helper method to create the list for practice
    void createPracticeList() {
        // Initializing the list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 3 -> 8 -> 9 -> 10
        this.head = new ListNode(1);
        ListNode current = this.head;

        current.next = new ListNode(2);
        current = current.next;

        current.next = new ListNode(3); // First '3'
        current = current.next;

        current.next = new ListNode(4);
        current = current.next;

        current.next = new ListNode(5); // Middle element for length 10
        current = current.next;

        current.next = new ListNode(6);
        current = current.next;

        current.next = new ListNode(3); // Duplicate element '3'
        current = current.next;

        current.next = new ListNode(8);
        current = current.next;

        current.next = new ListNode(9);
        current = current.next;

        current.next = new ListNode(10); // Tail
    }

    // Helper method to print the list
    void printList(ListNode startNode){
        ListNode temp = startNode;
        while(temp != null){
            System.out.print(temp.val);
            if(temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println(" (NULL)");
    }
}


public class SinglyLLForPractice {

    public static void main(String[] args) {
        PracticeSLL list = new PracticeSLL();


    }
}
