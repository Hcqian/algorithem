package algorithm;

import java.util.ArrayList;
import java.util.List;

public class PathSunII113 {
	List<List<Integer>> list = new ArrayList<>();
	int target = 0;

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		if (root == null)
			return list;
		target = sum;
		nodeAdd(root, 0, new ArrayList<>());
		return list;
	}

	public void nodeAdd(TreeNode root, int sum, List<Integer> sublist) {
		sum += root.val;
		sublist.add(root.val);
		if (sum == target&&root.left == null && root.right == null) {
			list.add(new ArrayList<>(sublist));
		}
		if (root.left != null) {
			nodeAdd(root.left, sum, sublist);
			sublist.remove(sublist.size() - 1);
		}
		if (root.right != null) {
			nodeAdd(root.right, sum, sublist);
			sublist.remove(sublist.size() - 1);
		}
	}
}
