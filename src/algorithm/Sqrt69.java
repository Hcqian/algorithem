package algorithm;

public class Sqrt69 {
	public int mySqrt(int x) {
		if(x==0) return x;
		int j=0;
		while(true){
			for(int i=1;;i=i*2){
				j+=i;
				if(x/j<j) {j=j-i;break;}
				if(x/j==j) return j;
			}
			if(x/(j+1)<(j+1)) return j;
		}
		
	}
}
