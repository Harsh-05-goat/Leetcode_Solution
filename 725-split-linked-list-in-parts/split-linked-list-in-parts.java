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
        int n=0;
        ListNode current = head;
        while(current != null){
            n++;
            current=current.next;
        }
        int quo=n/k;
        int rem=n%k;

        ListNode ans[]=new ListNode[k];
        current = head;
        for(int i=0;i<k;i++){
            ans[i]=current;
            int quo1=quo;
            if(rem>0){
                quo1++;
                rem--;
            }
            for(int j=1;j<quo1;j++){
                current=current.next;
            }
            if(current != null){
                ListNode temp=current.next;
                current.next=null;
                current=temp;
            }
        }
        return ans;
    }
}