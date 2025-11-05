package Linked_List.practise.leetcode;


//Leetcode - 19 -> Remove nth node from tail of LL
//nth node from last = (len-n+1)th node from start
// to delete (len-n+1)th node, we need (len - n)th node
public class RemoveNthFromEnd {
public ListNode removeNthFromEnd (ListNode head, int n) {
//    if(n==1) return null;
//    if(n==2) return head.next;
    ListNode current = head;
    int len = 0;
    while (current != null) {
        len++;
        current = current.next;
    }
    if (len == n) return head.next;
//    int len = len - n;
    current = head;
    for (int i = 1; i <= len-n+1; i++) {
        current = current.next;
    }
    current.next = current.next.next;
    return head;
}

public ListNode deleteNthFromEnd (ListNode head, int n) {
    ListNode slow = head;
    ListNode fast = head;

    for(int i=1;i<=n;i++){
        fast = fast.next;
    }

    while(fast.next != null){
        slow = slow.next;
        fast = fast.next;
    }
    slow.next = slow.next.next;
    return head;
}
}


