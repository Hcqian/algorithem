package algorithm;

public class RList61 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}

	public ListNode rotateRight(ListNode head, int k) {
		ListNode list=head;
		if(list.next==null||list==null) return head;
		int i=1;
		for(;list.next!=null;i++){
			list=list.next;
		}
		if(i==k) return head;
		list.next=head;
		list=head;
		for(int j=i-k;j>1;j--){
			list=list.next;
		}
		head=list.next;
		list.next=null;
		return head;
	}

}
