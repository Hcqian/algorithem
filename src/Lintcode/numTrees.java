package Lintcode;

public class numTrees {
	public int numTrees(int n) {
        // write your code here
		if(n==0) return 1;
		int[] nums=new int[n+1];
		nums[0]=1;nums[1]=1;
		for (int i = 2; i < nums.length; i++) {
			for (int k=0; k <=i-k-1; k++) {
				if(k==i-k-1)nums[i]+=nums[i-k-1]*nums[k];
				else {
				nums[i]+=nums[i-k-1]*nums[k]*2;
				}
			}
		}
		return nums[n];
    }
}
