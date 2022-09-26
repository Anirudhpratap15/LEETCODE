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
    public ListNode middleNode(ListNode head) {
        
        ArrayList<ListNode> list = new ArrayList();
        int  count = 0 ;
        
         
        while(head!=null){
           list.add(head) ;
            head = head.next;
            count+=1;
            
        }
        return list.get(count/2);
        
    }
}