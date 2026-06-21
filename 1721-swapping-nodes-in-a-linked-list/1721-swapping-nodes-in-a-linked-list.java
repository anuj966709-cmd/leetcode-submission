/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while(temp != null)
        {
            temp = temp.next;
            count++;
        }
        ListNode temp2 = head;
        for(int i = 1; i < k; i++)
        {
            temp2 = temp2.next;
        }
        ListNode temp3 = head;
        for(int i = 1; i < count-k+1; i++)
        {
            temp3 = temp3.next;
        }
        int temp4 = temp2.val;
        temp2.val = temp3.val;
        temp3.val = temp4;
        return head;

        
    }
}