package algorithm;

import java.util.ArrayList;
import java.util.List;

public class PSequence60 {
	public String getPermutation(int n, int k) {
		List<Integer> list=new ArrayList<>();
		int shu=1;
		String str="";
		for(int i=1;i<=n;i++){
			list.add(i);
			shu*=i;
		}
		shu=shu/n;
		while(n>1){
			int i=1;
			for(;i<n;i++){
				if(k<=i*shu) break;
			}
			str+=list.get(i-1);
			list.remove(i-1);
			k=k-(i-1)*shu;
			n--;
			shu=shu/n;
		}
		str+=list.get(0);
		return str;
	}
}
