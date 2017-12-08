package algorithm;

import java.util.Arrays;

public class H_index274 {
	public int hIndex(int[] citations) {
//		Arrays.sort(citations);
		int len=citations.length;
		int h=0;
//		for (int i = len; i>=0; i--) {
//			if(citations[i]<=h) break;
//			h++;
//		}
		int [] level=new int[len+1];
		for (int i = 0; i < level.length-1; i++) {
			if(citations[i]>=len){
				level[len]++;
			}else {
				level[citations[i]]++;
			}
		}
		for (int i = len; i >=0; i--) {
			h+=level[i];
			System.out.println(h+" "+i);
			if(h>=i) return i;
		}
		return h;
	}
}
