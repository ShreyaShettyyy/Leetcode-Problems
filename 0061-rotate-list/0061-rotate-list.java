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
    public static int countNode(ListNode head){
        ListNode n=head;
        int count=0;
        while(n!=null){
            count++;
            n=n.next;
        }
        return count;
    }
    public ListNode rotateNode(ListNode head){
        ListNode prev=null;
        ListNode n=head;
        while(n.next!=null){
            prev=n;
            n=n.next;
        }
        if(prev==null){
            return head;
        }

        n.next=head;
        prev.next=null;
        head=n;

        return head;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null){
            return head;
        }
        int i=0;
        k=k%countNode(head);
        while(i<k){
            head=rotateNode(head);
            i++;
        }

        return head;
    }
}