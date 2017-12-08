package algorithm;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {
	public List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<>();
		if (nums == null || nums.length == 0)
			return list;
		int start = nums[0];
		int end = nums[0];
		String s = "";
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] - nums[i - 1] == 1) {
				end = nums[i];
				continue;
			}
			if (start == end) {
				s = "" + start;
				list.add(s);
			} else {
				s = start + "->" + end;
				list.add(s);
			}
			start = end = nums[i];
		}
		if (start == end) {
			s = "" + start;
			list.add(s);
		} else {
			s = start + "->" + end;
			list.add(s);
		}
		
		return list;
	}
}
