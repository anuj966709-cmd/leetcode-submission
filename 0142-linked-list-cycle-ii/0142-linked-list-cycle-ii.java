public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode ans = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                slow = slow.next;
                while(slow != fast)
                {
                    if(slow == ans)
                    return ans;
                    slow = slow.next;
                }
                if(slow == ans)
                return ans;
                ans = ans.next;
            }
        }
        return null;
    }
}