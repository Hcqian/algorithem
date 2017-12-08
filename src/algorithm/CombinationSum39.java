package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum39 {
	List<List<Integer>> list;
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		this.list=new ArrayList<>();
		addlist(candidates, target, candidates.length-1, new ArrayList<>());
		return list;
	}
	
	public void addlist(int[] nums,int target,int index,List<Integer> sublist){
		if(index<0||target<nums[0]) return;
		int flag=findTarget(nums, target, 0, index);
		if(nums[flag]==target){
			List<Integer> l=new ArrayList<>(sublist);
			l.add(nums[flag]);
			list.add(l);
			flag--;
		}
		for (int i = flag; i >=0; i--) {
			sublist.add(nums[i]);
			addlist(nums, target-nums[i], i, sublist);
			sublist.remove(sublist.size()-1);
		}
		
		
	}
	public int findTarget(int[] nums,int target,int i,int j){
		int mid ;
		while(i<j){
			mid=(i+j)/2;
			if(nums[mid]==target) return mid;
			if(nums[mid]<target) i=mid+1;
			else j=mid-1;
		}
		return i;
	}
}
