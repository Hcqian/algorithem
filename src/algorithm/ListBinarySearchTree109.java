package algorithm;

public class ListBinarySearchTree109 {
	public TreeNode sortedListToBST(ListNode head) {
		if(head==null) return null;
		return tree(head,null);
	}
	public TreeNode tree(ListNode head,ListNode tail){
		if(head==tail) return null;
		ListNode end=head;
		ListNode mid=head;
		while(end!=tail&&end.next!=tail){
			end=end.next.next;
			mid=mid.next;
		}
		TreeNode root=new TreeNode(mid.val);
		root.left=tree(head,mid);
		root.right=tree(mid.next,tail);
		return root;
	}

}
