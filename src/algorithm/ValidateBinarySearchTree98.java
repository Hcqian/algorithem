package algorithm;

import java.util.Stack;

import algorithm.BinaryTreeInorderTraversal94.TreeNode;

public class ValidateBinarySearchTree98 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isValidBST(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = root;
		TreeNode pre = null;
		while (!stack.isEmpty()||node!=null){
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
			if(stack.isEmpty()) break;
			node=stack.pop();
			if(pre!=null&&node.val<=pre.val) return false;
			pre=node;
			node=node.right;
			
		} 
		return true;
	}
}
