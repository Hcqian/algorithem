package algorithm;

public class LinkedListCycle142 {
	public ListNode detectCycle(ListNode head) {
		if (head == null)
			return null;
		ListNode node=head;
		while(head!=node){
			if(head==null&&node==null) return null;
			node=node.next.next;
			head=head.next;
		}
		
		return head;
	}

}
