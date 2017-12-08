package algorithm;


public class CoInorderPostorderTree106 {
	int[] postorder;
	int[] inorder;
	int posi=0;

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode buildTree(int[] postorder, int[] inorder) {
		this.postorder = postorder;
		this.inorder = inorder;
		this.posi=postorder.length-1;
		return tree(0, inorder.length - 1);
	}

	public TreeNode tree(int ins, int ine) {
		if (posi>=0 && ins <=ine) {
			TreeNode root = new TreeNode(postorder[posi]);
			int i=findin(ins,ine,postorder[posi]);
			posi--;
			root.right=tree(i+1,ine);
			root.left=tree(ins,i-1);
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
