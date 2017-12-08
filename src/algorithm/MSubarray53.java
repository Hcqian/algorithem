package algorithm;

public class MSubarray53 {

	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int num = nums[0];
		for(int i=1;i<nums.length;i++){
			num=Math.max(num+nums[i], nums[i]);
			max=Math.max(max, num);
		}

		return max;
	}
}
