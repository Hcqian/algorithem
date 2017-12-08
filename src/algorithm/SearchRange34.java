package algorithm;

public class SearchRange34 {
	public int[] searchRange(int[] nums, int target) {
		int end=nums.length-1;
		int[] result={0,0};
		int start=0;
		int mid=end/2;
		while(start<=end){
			if(nums[mid]==target) {
			result[0]=result[1]=start=end=mid;
			while(start!=0&&nums[mid]==nums[--start]) {result[0]=start;}
			while(end!=(nums.length-1)&&nums[mid]==nums[++end]){result[1]=end;}
			break;
			}
			if(nums[mid]>target) {end=mid-1; mid=end/2;}
			if(nums[mid]<target) {start=mid+1;mid=(start+end)/2;}
		}
		if(nums[mid]!=target){
			result[0]=result[1]=-1;
		}else{
		
		}
		return result;
	}
}
