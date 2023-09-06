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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            curr = curr.next;
            count++;
        }

        int size = count / k;
        int extra = count % k;

        ListNode[] result = new ListNode[k];
        curr = head;
        for (int i = 0; i < k && curr != null; i++) {
            result[i] = curr;
            int partSize = size + (i < extra ? 1 : 0);
            for (int j = 0; j < partSize - 1; j++) {
                curr = curr.next;
            }
            ListNode next = curr.next;
            curr.next = null;
            curr = next;
        }
        return result;
    }
}
