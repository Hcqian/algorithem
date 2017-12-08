package Lintcode;

public class maxPathSum {
	 public class TreeNode {
		      public int val;
		      public TreeNode left, right;
		      public TreeNode(int val) {
		          this.val = val;
		          this.left = this.right = null;
		      }
		  }
	 public int maxSum=Integer.MIN_VALUE;
	 public int maxPathSum(TreeNode root) {
	        // write your code here
		 findPath(root);
		 return maxSum;
	    }
	 public int findPath(TreeNode root){
		 if(root==null) return 0;
		 int leftsum=0,rightsum=0, a=0,b=0;
		 rightsum=findPath(root.right);
		 leftsum=findPath(root.left);
		 a=Math.max(root.val+Math.max(leftsum, rightsum),root.val);
		 b=Math.max(a, root.val+rightsum+leftsum);
		 maxSum=Math.max(maxSum, b);
		 return a; 
		 
	 }
}
