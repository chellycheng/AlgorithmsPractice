import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers() {	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		   	Queue<Integer> s1 = new LinkedList<Integer>();
	
	
	int c = 0;
	
	while (l1!=null&l2!=null) {
		int added = l1.val+ l2.val;
		 if(c!=0){
	         added +=c;
	         c =0;
	     }
		  if(added>=10){
	          c=1;
	          added %=10;
	      }
		  s1.add(added);
		  l1 = l1.next;
		  l2 = l2.next;
	}
	while (l1!=null) {
		int added = l1.val;
		 if(c!=0){
	         added +=c;
	         c =0;
	     }
		  if(added>=10){
	          c=1;
	          added %=10;
	      }
		  s1.add(added);
		  l1 = l1.next;
	}
	while(l2!=null) {
		int added = l2.val;
		 if(c!=0){
	        added +=c;
	        c =0;
	    }
		  if(added>=10){
	         c=1;
	         added %=10;
	     }
		  s1.add(added);
		  l2 = l2.next;
	}
	if(c!=0){
	    s1.add(c);
	    c =0;
	}
	ListNode head=new ListNode(0) ;
	ListNode ptr = head;
	while(s1.size()!=1) {
		ptr.val = s1.remove();
	    ptr.next = new ListNode(0);
	    ptr = ptr.next;
	    
	}
	if(s1.size()==1){
	     ptr.val = s1.remove();
	    }
	return head;
	}
}