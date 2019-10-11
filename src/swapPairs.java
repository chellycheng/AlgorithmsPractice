
public ListNode swapPairs(ListNode head) {
        ListNode ptr = head;
        if(ptr==null){
            return head;
        }
        while(ptr.next!=null){
            ListNode n1 = ptr.next;
            int sw = ptr.val ;
            ptr.val = n1.val ;
            n1.val = sw ;
            if(ptr.next.next!=null) {
                 ptr = ptr.next.next;
            }
            else{
                break;
            }
        }
        return head;
    }