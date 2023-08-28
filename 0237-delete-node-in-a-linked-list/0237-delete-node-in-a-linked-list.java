/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val; //in case of giveen node paramter need to delete simply di one thing given parameter node value put as node,next then it store the value of next node value; 
        
        node.next = node.next.next;
    }
}