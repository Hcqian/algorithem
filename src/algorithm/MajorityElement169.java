package algorithm;

public class MajorityElement169 {
	public int majorityElement(int[] nums) {
		int majority = -1;
		int count = 0;
		for (int num : nums) {
			if(count==0){
				majority=num;
				count++;
			}else {
				if(majority==num) count++;
				else count--;
			}
		}
		return count;

	}
}
