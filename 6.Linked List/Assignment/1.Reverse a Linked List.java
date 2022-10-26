class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode t=head,q=null,r=null;
        while(t!=null){
            r=q;
            q=t;
            t=t.next;
            q.next=r;
        }
        return q;
    }
}
