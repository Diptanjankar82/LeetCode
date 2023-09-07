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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current = head, prev = null;
        int count = 1;
        while (count != left) {
            prev = current;
            current = current.next;
            count++;
        }

        ListNode start = current;
        while (count != right) {
            current = current.next;
            count++;
        }

        ListNode rest = current.next;
        current.next = null;

        ListNode newHead = reverse(start);
        if (prev != null) {
            prev.next = newHead;
        }
        current = newHead;
        while (current.next != null) {
            current = current.next;
        }
        current.next = rest;
        
        if (left == 1) {
            return newHead;
        } else {
            return head;
        }
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}