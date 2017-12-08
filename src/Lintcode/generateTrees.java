package Lintcode;

import java.util.ArrayList;
import java.util.List;

public class generateTrees {
	public class TreeNode {
		public int val;
		public TreeNode left, right;

		public TreeNode(int val) {
			this.val = val;
			this.left = this.right = null;
		}
	}

	public List<TreeNode> generateTrees(int n) {
		return tree(1, n);
	}

	public List<TreeNode> tree(int s, int e) {
		if (s > e) {
			List<TreeNode> sl= new ArrayList<>();
			sl.add(null);
			return sl;
		}

		List<TreeNode> slist = new ArrayList<>();
		for (int i = s; i <= e; i++) {
			for (TreeNode left : tree(s, i-1)) {
				for (TreeNode right : tree(i + 1, e)) {
					TreeNode node = new TreeNode(i);
					node.left = left;
					node.right = right;
					slist.add(node);
				}
			}
		}
		return slist;
	}
}
