package Linked_List.practise.leetcode;
//Leetcode -> 21. Merge Two Sorted Lists
public class Merge {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode current = new ListNode(0);
        ListNode dummy = current;

        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                dummy.next = temp1;
                temp1 = temp1.next;
            } else {
                dummy.next = temp2;
                temp2 = temp2.next;
            }
            dummy = dummy.next;
        }
        if(temp1 == null)  dummy.next = temp2;
        else dummy.next = temp1;
        return current.next;
    }

    //23. Merge k Sorted Lists
    /*
    * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
    Merge all the linked-lists into one sorted linked-list and return it.
    */
//    static class MergeKSortedList {
//        public ListNode mergeKLists(ListNode[] lists) {
//            return lists;
//        }
//    }
}
