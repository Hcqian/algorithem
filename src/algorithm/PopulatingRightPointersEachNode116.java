package algorithm;

public class PopulatingRightPointersEachNode116 {
	public class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;

		TreeLinkNode(int x) {
			val = x;
		}
	}

	public void connect(TreeLinkNode root) {
		TreeLinkNode hlist = root, llist = null;
		while (root.left!= null) {
			llist=root.left;
			while (hlist != null) {
					llist.next = hlist.left;
					llist = llist.next;
					llist.next = hlist.right;
					llist = llist.next;
				hlist=hlist.next;
			}
			hlist=root.left;
			root=root.left;
		}

	}
}
