package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal94 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list=new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = root;
		do {
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
			if(stack.isEmpty()) break;
			node=stack.pop();
			list.add(node.val);
			node=node.right;
			
		} while (!stack.isEmpty()||node!=null);

		return list;
	}
}
