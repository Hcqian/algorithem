package algorithm;

public class RangeSumQuery303 {
	private int[] numss;
	public	void NumArray(int[] nums) {
		numss=new int[nums.length];
		int sum=0;
		for (int i = 0; i < numss.length; i++) {
			sum+=nums[i];
			numss[i]=sum;
		}
    }
    public int sumRange(int i, int j) {
    	if(i==0) return numss[i];
    	return numss[j]-numss[i-1];
    }

}
