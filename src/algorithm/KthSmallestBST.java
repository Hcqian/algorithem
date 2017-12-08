package algorithm;

public class KthSmallestBST {
	int i =0;
	int value = 0;

	public int kthSmallest(TreeNode root, int k) {
		findk(root,k);
		return value;
	}

	public boolean findk(TreeNode node, int k) {
		if (node == null)
			return false;
		if (findk(node.left, k))
			return true;
		i++;
		if (i == k) {
			value = node.val;
			return true;
		}
		return findk(node.right, k);
	}
}
