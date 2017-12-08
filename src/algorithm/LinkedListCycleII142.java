package algorithm;

public class LinkedListCycleII142 {
	public ListNode detectCycle(ListNode head) {
		if(head==null) return null;
		ListNode runner=head,walk=head;
		while(runner.next!=null&&runner.next.next!=null){
			runner=runner.next.next;
			walk=walk.next;
			if(walk==runner){
				while(walk!=head){
					walk=walk.next;
					head=head.next;
				}
				return head;
			}
		}
		return null;

	}
}
