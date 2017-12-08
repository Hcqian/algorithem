package algorithm;

public class jumpgame55 {
	public boolean canJump(int[] nums) {
	int reach=1;
	for(int j=0;j<nums.length&&j<=reach;j++){
		reach=Math.max(j+nums[j], reach);
	}	
		return reach>=nums.length;
	}

}
