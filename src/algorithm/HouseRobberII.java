package algorithm;

public class HouseRobberII {
	public int rob(int[] nums){
    if(nums.length==1) return nums[0];
        int a=0,b=0;
	for (int i = 0; i < nums.length-1; i++) {
		int c=Math.max(a+nums[i], b);
		a=b;
		b=c;
	}
	int d=0,e=0;
	for (int i = 1; i < nums.length; i++) {
		int c=Math.max(d+nums[i], e);
		d=e;
		e=c;
	}
	return Math.max(Math.max(a,b),Math.max(d,e));
	}
}
