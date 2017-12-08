package Lintcode;

public class houseRobber {
	public long houseRobber(int[] A) {
        // write your code here
		if(A.length==0) return 0;
		if(A.length==1) return A[0];
		if(A.length==2) return Math.max(A[0], A[1]);
		long[] value=new long[4];
		if(A.length>=3)  value[3]=A[2]+A[1];
		value[0]=A[0];value[1]=A[1];
		for (int i = 3; i < A.length; i++) {
			value[i%4]=A[i]+Math.max(value[(i-2)%4], value[(i-3)%4]);
		}
		return Math.max(value[(A.length-1)%4], value[(A.length-2)%4]);
    }
}
