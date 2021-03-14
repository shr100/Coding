/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return head;
        
        //Hashmap to store all nodes in the linked list
        HashMap<Integer,ArrayList<ListNode>> map = new HashMap<Integer,ArrayList<ListNode>>();
        
        while(head!=null){
            //ArrayList to store duplicate key values in a HashMap
            ArrayList<ListNode> arr = new ArrayList<ListNode>();
            if(!map.containsKey(head.val)){
                arr.add(head.next);
                map.put(head.val,arr);
            }
            else{
                if((map.get(head.val)).contains(head.next)){
                    return head;
                }
                else{
                    arr = map.get(head.val);
                    arr.add(head.next);
                    map.put(head.val,arr);
                }
                
            }
            head = head.next;
        }

        return null;
        
    }
}