//Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int len = 0;
        ListNode current ;
        current = head;
        while(current!=null){
            len++;
            current = current.next;
        }
        
       
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int ele = len - n;
        System.out.println(ele);
        int c = 0;
        if(n==1){
            if(len==1){
             head = head.next;
            return head;
        }
            while(head!=null){
                if(head.next.next==null){
                    head.next = null;
                    break;
                }
                else{
                head = head.next;
                }
            }
            return dummy.next;
        }
            else{
        while(head!=null){
            System.out.println("C "+c);
            
            
            if(c==ele){
                
                
                head.val = head.next.val;
                head.next=head.next.next;
                
                head = head.next;
                
            }
            else{
            head = head.next;
            }
           
            c++;
        }
        
        
        return dummy.next;
            }
            
        
    }
}