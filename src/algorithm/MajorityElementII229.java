package algorithm;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII229 {
	public List<Integer> majorityElement(int[] nums) {
		List<Integer> list = new ArrayList<>();
		if (nums.length == 0 || null == nums)
			return list;
		int number1 = 0, count1 = 0, number2 = 0, count2 = 0;
		for (int i = 1; i < nums.length; i++) {
			if (number1 == nums[i]) {
				count1++;
			} else if (number2 == nums[i]) {
				count2++;
			} else if (count1 == 0) {
				number1 = nums[i]; count1++;
			} else if (count2 == 0) {
				number2 = nums[i]; count2++;
			} else {
				count1--;
				count2--;
			}
		}
		count1=0;
		count2=0;
		for (Integer integer : nums) {
			if(integer==number1) count1++;
			else if(integer==number2) count2++;
		}
		System.out.println(count1);
		if (count1 > nums.length/3)
			list.add(number1);
		if (count2 > nums.length/3)
			list.add(number2);
		return list;
		
	}
}
