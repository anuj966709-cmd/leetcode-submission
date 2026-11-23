
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0;
        int countB = 0;
        ListNode tempA = headA;
        while(tempA != null)
        {
            tempA = tempA.next;
            countA++;
        }
        ListNode tempB = headB;

        while(tempB != null)
        {
            tempB = tempB.next;
            countB++;
        }
        if(countA > countB)
        {
            int finalCount = countA-countB;
            ListNode tempA1 = headA;
            for(int i = 1; i <= finalCount; i++)
            {
                tempA1 = tempA1.next;
            }
            ListNode tempB1 = headB;
            while(tempA1 != tempB1)
            {
                tempA1 = tempA1.next;
                tempB1 = tempB1.next;
            }
            return tempA1;
        }
        else
        {
            int finalCount = countB-countA;
            ListNode tempB1 = headB;
            for(int i = 1; i <= finalCount; i++)
            {
                tempB1 = tempB1.next;
            }
            ListNode tempA1 = headA;
            while(tempA1 != tempB1)
            {
                tempA1 = tempA1.next;
                tempB1 = tempB1.next;
            }
            return tempA1;
        }   
    }
}