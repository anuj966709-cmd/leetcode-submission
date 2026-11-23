class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head.next == null)
        {
            return null;
        }
        // if(head.next.next == null)
        // {
        //     head.next = null;
        //     return head;
        // }
        fast = fast.next.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}