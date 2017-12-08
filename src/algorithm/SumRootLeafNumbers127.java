package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SumRootLeafNumbers127 {
	public int sumNumbers(TreeNode root) {
		if(root==null) return 0;
		int sum = 0;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Stack<TreeNode> stackII = new Stack<>();
			while (!stack.isEmpty()) {
				TreeNode node = stack.pop();
				if(node.left == null&&node.right == null){
					sum+=node.val;
				}
				if (node.left != null){
					node.left.val=node.left.val+node.val*10;
					stackII.push(node.left);}
				if (node.right != null){
					node.right.val=node.right.val+node.val*10;
					stackII.push(node.right);}
			}
			stack=stackII;
		}
		return sum;
	}
}
