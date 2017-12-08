package algorithm;

import java.util.Stack;

public class reoderlist143 {
	public void reorderList(ListNode head) {
		Stack<ListNode> stack = new Stack<>();
		ListNode rehead = head, tail = head, mid = head;
		while (mid != null) {
			if (tail!=null&&tail.next != null) {
				tail = tail.next.next;
			}
		}
		rehead = head;
		tail = stack.pop();
		while (rehead != tail && tail.next != rehead) {
			tail.next = rehead.next;
			rehead.next = tail;
			rehead = tail.next;
			tail = stack.pop();
		}
		rehead.next = null;

	}
	// public boolean relist(ListNode tail){
	// if(tail==null) return false;
	// if(relist(tail.next)) return true;
	// if(tail==rehead||tail.next==rehead){
	// rehead.next=null;
	// return true;
	// }
	//
	// tail.next=rehead.next;
	// rehead.next=tail;
	// rehead=tail.next;
	//
	// return false;
	// }
}
