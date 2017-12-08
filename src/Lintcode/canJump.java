package Lintcode;

public class canJump {
	//动态规划解法
	public boolean canJump(int[] A) {
        // write your code here
		if(A.length==0) return true;
		boolean[] dp=new boolean[A.length];
		dp[0]=true;
		for (int i = 0; i < dp.length; i++) {
			if(dp[i]){
				for (int j = 1; j <=A[i]; j++) {
					if(j+i<A.length)dp[i+j]=true;
				}
			}
		}
		return dp[A.length-1];
    }
	//贪心解法
	public boolean canJumpII(int[] A) {
        // write your code here
		if(A.length==0) return true;
		int maxlen=A[0];
		for (int i = 0; i < A.length; i++) {
			if(i<=maxlen) maxlen=Math.max(maxlen, i+A[i]);
		}
		return maxlen>=A.length;
    }
}
