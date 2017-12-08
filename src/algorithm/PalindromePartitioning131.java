package algorithm;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning131 {
	List<List<String>> list;
	public List<List<String>> partition(String s) {
		List<List<String>> list=new ArrayList<>();
		this.list=list;
		findPalindrome(s, 0, new ArrayList<>());
		return list;
	}
	public void findPalindrome(String s,int start,List<String> sublist){
		if(start>=s.length()) {list.add(sublist);return;}
		List<String> slist=new ArrayList<>(sublist);
		slist.add(s.substring(start, start+1));
		findPalindrome(s,start+1,slist);
		for(int i=start+1;i<s.length();i++){
			if(isPalindrome(s, i, start)){
				List<String> sslist=new ArrayList<>(sublist);
				sslist.add(s.substring(start, i+1));
				findPalindrome(s,i+1,sslist);
			}
		}
	}
	public boolean isPalindrome(String s,int i,int start){
		int left,right;
		left=start;right=i;
		while(left>=start&&right<s.length()&&s.charAt(left)==s.charAt(right)){
			if(left==right||left==right+1) return true;
			left++;right--;
		}
		return false;
	}
}
