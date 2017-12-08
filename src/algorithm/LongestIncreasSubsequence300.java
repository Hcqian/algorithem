package algorithm;


public class LongestIncreasSubsequence300 {
	public int lengthOfLIS(int[] nums) {
		if(nums.length==0) return 0;
		int[] len=new int[nums.length+1];
		len[1]=nums[0];
		int maxlen=1;
		for (int i = 0; i < nums.length; i++) {
			int l=1,r=maxlen;
			while(l<r){
				 int mid=l+((r-l)>>1);
				 if(len[mid]>nums[i]){
					 r=mid-1;
				 }else {
					l=mid+1;
				}
			}
			if(len[l]==nums[i]||len[l-1]==nums[i]||len[l+1]==nums[i]) continue;
			else if(len[l]<nums[i]){
				len[l+1]=nums[i];
				maxlen=Math.max(l+1,maxlen);
			}else {
				len[l]=nums[i];
			}
		}
		
		return maxlen;
	}
}
