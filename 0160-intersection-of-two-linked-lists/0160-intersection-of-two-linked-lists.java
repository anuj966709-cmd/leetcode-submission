/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0;
        int countB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA != null)
        {
            countA++;
            tempA = tempA.next;
        }
        while(tempB != null)
        {
            countB++;
            tempB = tempB.next;
        }
        if(countA > countB)
        {
            int fast = countA - countB;
            ListNode tempA1 = headA;
            ListNode tempB1 = headB;
            for(int i = 1; i <= fast; i++)
            {
                tempA1 = tempA1.next;
            }
            for(int j = 1; j <= countB; j++)
            {
                if(tempA1 == tempB1)
                {
                    return tempA1;
                }
                else
                {
                    tempA1 = tempA1.next;
                    tempB1 = tempB1.next;
                }
            }
            return null;
        }
        else
        {
            int fast = countB - countA;
            ListNode tempA1 = headA;
            ListNode tempB1 = headB;
            for(int i = 1; i <= fast; i++)
            {
                tempB1 = tempB1.next;
            }
            for(int j = 1; j <= countA; j++)
            {
                if(tempA1 == tempB1)
                {
                    return tempA1;
                }
                else
                {
                    tempA1 = tempA1.next;
                    tempB1 = tempB1.next;
                }
            }
            return null;

        }
        
    }
}