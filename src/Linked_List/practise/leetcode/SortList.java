package Linked_List.practise.leetcode;
//LeetCode -> 148. Sort List
 //Use Recursion
//Logic is -> we will divide the linked list into two parts and then merge them like we did in merge two sorted list
//We want left middle not right one as did previously
//For Even Length LL to get left middle -> while(fast.next.next != null)
//For Odd Length LL to get left middle -> while(fast.next != null)
//Then to sort the Lists use recursion
//Then use merge two sorted list logic
public class SortList {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode firstHalf = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = slow.next;
        slow.next = null;
        firstHalf = sortList(firstHalf);
        secondHalf = sortList(secondHalf);
        ListNode ans = mergeList(firstHalf, secondHalf);
        return ans;
    }

    private ListNode mergeList(ListNode head1, ListNode head2) {
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(temp1 !=  null && temp2 != null){
            if(temp1.val <= temp2.val){
                current.next = temp1;
                temp1 = temp1.next;
            } else {
                current.next = temp2;
                temp2 = temp2.next;
            }
            current = current.next;
        }
        if (temp1 == null) current.next = temp2;
        else current.next = temp1;
        return dummy.next;
    }
}
