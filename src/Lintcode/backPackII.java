package Lintcode;

public class backPackII {
	public int backPackII(int m, int[] A, int[] V) {
		int[] ms=new int[m+1];
		int max=0;
		for (int i = 0; i < A.length; i++) {
			for (int j = m; j >=A[i] ; j--) {
				if(j-A[i]==0||ms[j-A[i]]!=0){ ms[j]=Math.max(ms[j], ms[j-A[i]]+V[i]);
				max=Math.max(max, ms[j]);
				}
			}
		}
		return max;
    }
}
