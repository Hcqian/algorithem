package algorithm;

public class FindDuplicateNumber287 {
	public int findDuplicate(int[] nums) {
		int walk=0,run=0;
		while(true){
			walk=nums[walk];
			run=nums[nums[run]];
			if(walk==run) break;
		}
		walk=0;
		while(walk!=run){
			walk=nums[walk];
			run=nums[run];
		}
		return run;
	}
}
