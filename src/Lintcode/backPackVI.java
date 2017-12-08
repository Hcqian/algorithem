package Lintcode;

public class backPackVI {
	public int backPackVI(int[] nums, int target) {
        // Write your code here
		int[] times=new int[target+1];
		times[0]=1;
		for (int i = 1; i < times.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(i-nums[j]>=0){
					times[i]+=times[i-nums[j]];
				}
			}
		}
		return times[target];
    }
}
