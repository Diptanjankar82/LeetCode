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
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         while(head != null){
//             arr.add(head.val);
//             head = head.next;
//         }
//         for(int i =0; i<arr.size()/2;i++){
//             if(arr.get(i)  != arr.get(arr.size()-i-1)) return false;
//         }
//         return true;
//     }
// }

class Solution{
  public boolean isPalindrome(ListNode head) {
    if(head == null || head.next == null)
        return true;
    
    ListNode slow = head;
    ListNode fast = head;


    // Find Middle of The LinkedList

    while(fast.next != null && fast.next.next!= null){
        slow = slow.next;
        fast = fast.next.next;
    }
     // Reverse the secondhalf
    slow.next = reverseList(slow.next);

    //Now move slow to right Half

    slow = slow.next;

    while(slow!=null){
        if(head.val != slow .val){
            return false;
        }
         head = head.next;
            slow = slow.next;

    }
    return true;
  }
    //function to reverse
    ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode next = null;
        while(head != null){
          next = head.next;
          head.next = pre; // here i connect to preveious node -->>
          pre = head;
          head = next;
        }
        return pre;  
    }

   

    //Check left half and right half equal or not

    

  }
