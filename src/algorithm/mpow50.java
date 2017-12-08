package algorithm;

public class mpow50 {
	public double myPow(double x, int n) {
		long b=(long)n;
		boolean flag=false;
		if(b<0) { b=-b; flag=true;} 
		double v=mpow(x, (int)(b/2));
		v=v*v*mpow(x, (int)(b%2));
		return flag? 1/v:v;
				
	}
	public double mpow(double x,int n) {
		if(n==0) return 1;
		if(n==1) return x;
		double v=mpow(x, n/2);
		return v=v*v*mpow(x, n%2);
	}
}
