package algorithm;

public class BinarySearchTree108 {
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length==0) return null;
		return tree(0,nums.length-1,nums);
	}
	
	public TreeNode tree(int start,int end,int[] nums){
		if(start<0||end>=nums.length||start>end) return null;
		int mid=(start+end)>>1;
		TreeNode root=new TreeNode(nums[mid]);
		if(start==end) return root;
		root.left=tree(start,mid-1,nums);
		root.right=tree(mid+1,end,nums);
		return root;
	}
}
