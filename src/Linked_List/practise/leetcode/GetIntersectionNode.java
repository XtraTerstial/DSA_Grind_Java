package Linked_List.practise.leetcode;
//L.C -> 160
//Finding intersection of two linked list
//Hint #1:- Find length of both lists
//Hint #2:- Increment bigger list by(m-n) times
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA, tempB = headB;
        int sizeA = 0, sizeB = 0;
        while (tempA != null){
            sizeA++;
            tempA = tempA.next;
        }
        while (tempB != null){
            sizeB++;
            tempB = tempB.next;
        }
        tempA = headA; tempB = headB;
        if(sizeA > sizeB){
            int dif = sizeA - sizeB;
            for (int i = 1; i <= dif; i++) {
                tempA = tempA.next;
            }
        } else {
            int dif = sizeB - sizeA;
            for (int i = 1; i <= dif; i++) {
                tempB = tempB.next;
            }
        }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}
