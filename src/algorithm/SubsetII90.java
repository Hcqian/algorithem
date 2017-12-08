package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII90 {
	List<List<Integer>> list =new ArrayList<>();
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		subset(0, new ArrayList<>(), nums);
		return list;
    }
	public void subset(int start,List<Integer> sublist,int[] nums){
		list.add(new ArrayList<>(sublist));
		for(int i=start;i<nums.length;i++){
			if(i!=start&&nums[i]==nums[i-1]) continue;
			sublist.add(nums[i]);
			subset(i+1,sublist,nums);
			sublist.remove(sublist.size()-1);
		}
	}
	
	
}
