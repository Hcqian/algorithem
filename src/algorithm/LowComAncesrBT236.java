package algorithm;

import java.util.Stack;

public class LowComAncesrBT236 {
	TreeNode node=null,low=null;boolean k=false;
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		findpq(root, p, q);
		return low;
	 }
	 public void findpq(TreeNode root, TreeNode p, TreeNode q){
		 if(root==null||low!=null) return;
		 if(!k) node=root;
		 if(root==p||root==q){
			 if(k){low=node; return;}
			 else k=true;
		 }
		 findpq(root.left,p,q);
		 if(k&&node==root.left) node=root;
		 findpq(root.right, p, q);
		 if(k&&node==root.right) node=root;
	 }
}
