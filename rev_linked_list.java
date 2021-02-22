//Link: https://leetcode.com/problems/reverse-linked-list/
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
import java.util.*;
class Solution {
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode current = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while(current!=null){
            arr.add(current.val);
            current = current.next;
        }
        for(int i=arr.size()-1;i>=0;i--){
            head.val = arr.get(i);
            head = head.next;
        }
        return dummy.next;
    }
}