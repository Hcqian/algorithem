package algorithm;

import java.util.Stack;

public class PerfectSquares279 {
	public int numSquares(int n) {
		int[] num=new int[n+1];
		for (int i = 1; i <=n; i++) {
			num[i]=4;
			for (int j = 1; i-j*j>=0; j++) {
				num[i]=Math.min(num[i-j*j]+1, num[i]);
			}
		}
		return num[n];
		
		
		
//		Stack<Integer> s=new Stack<>();
//		Stack<Integer> s2=new Stack<>();
//		s.add(n);
//		int times=1;
//		while(true){
//			int target=s.pop();
//			int ipow=1;
//			for (int i = 1; ipow <=target; i++,ipow=i*i) {
//				int b=target-ipow;
//				if(b==0) return times;
//				else {
//					s2.add(b);
//				}
//			}
//			if(s.isEmpty()){
//				times++;
//				Stack<Integer> stemp=s;
//				s=s2;
//				s2=stemp;
//			}
//			
//		}
//		
	}
}
