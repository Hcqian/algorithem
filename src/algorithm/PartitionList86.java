package algorithm;

public class PartitionList86 {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	 public ListNode partition(ListNode head, int x) {
		 ListNode little=new ListNode(0);
		 ListNode big=new ListNode(0);
		 ListNode l1=little,l2=big;
		 while(head!=null){
			 if(head.val<x){
				little.next=head;
				little=head;
			 }else {
				 big.next=head;
				 big=head;
			}
			 head=head.next;
		 }
		 big.next=null;
		 little.next=l2.next;
		return l1.next;
	    }

}
