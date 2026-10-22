
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while (count < k) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
            count++;
        }

        ListNode prevnode = reverseKGroup(temp, k);
        temp = head;
        count = 0;
        while (count < k) {
            ListNode next = temp.next;
            temp.next = prevnode;
            prevnode = temp;
            temp = next;
            count++;
        }
        return prevnode;
    }
}
