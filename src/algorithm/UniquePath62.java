package algorithm;
//到达每一个网格的路径数等于它上面和左面网格的路径数之和。 
public class UniquePath62 {
//	int i=0;
	public int uniquePaths(int m, int n) {
		if(m==0||n==0) return 0;
		int[][] martix=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(i==0) martix[i][j]=1;
				if(j==0) martix[i][j]=1;
				if(i!=0&&j!=0) martix[i][j]=martix[i][j-1]+martix[i-1][j];
				
			}
		}
		return martix[m-1][n-1];
		
		
//		paths(m, n);
//		return i;
//	}
//	public void paths(int m,int n){
//		if(n==1&&m==1){i++; return;}
//		if(n>1) {
//		paths(m, n-1);}
//		if(m>1){ 
//		paths(m-1, n);}
//		
		
	}
}
