package algorithm;

import java.util.*;

public class GAnagrams49 {
	 public List<List<String>> groupAnagrams(String[] strs) {
		 if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
		Map<String,List<String>> map= new HashMap<>();
		 for(String str:strs){
			 char [] cs=str.toCharArray();
			 Arrays.sort(cs);
			 String key=String.valueOf(cs);
			 if(!map.containsKey(key)) map.put(key, new ArrayList<>());
			 map.get(key).add(str); 
		 }
		 return new ArrayList<List<String>>(map.values());
	    }
}
