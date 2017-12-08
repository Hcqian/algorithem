package algorithm;

public class CoBinaryPTraversal105 {
	int[] preorder;
	int[] inorder;
	int prei=0;

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		this.preorder = preorder;
		this.inorder = inorder;
		return tree(0, inorder.length - 1);
	}

	public TreeNode tree(int ins, int ine) {
		if (prei <= preorder.length - 1 && ins <=ine) {
			TreeNode root = new TreeNode(preorder[prei]);
			int i=findin(ins,ine,preorder[prei]);
			prei++;
			root.left=tree(ins,i-1);
			root.right=tree(i+1,ine);
			return root;
		} else {
			return null;
		}
	}
	public int findin(int ins, int ine,int target){
		int j = (ins + ine) >> 1;
		for (int i = j; i >= 0; i--) {
			if(inorder[i]==target) return i;
		}
		for (int i = j+1; i <=ine; i++) {
			if(inorder[i]==target) return i;
		}
		return -1;
	}
}
