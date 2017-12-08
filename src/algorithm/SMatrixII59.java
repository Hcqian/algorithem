package algorithm;

public class SMatrixII59 {
	public int[][] generateMatrix(int n) {
		int[][] matrix=new int[n][n];
		if(n==0) return matrix;
		matrix(matrix, 0, n,1);
		return matrix;
	}
	public void matrix(int[][] matrix,int start,int len,int k){
		if(start+1>len){return;}
		for(int i=start;i<len;i++){
			matrix[start][i]=k;
			k++;
		}
		for(int i=start+1;i<len;i++){
			matrix[i][len-1]=k;
			k++;
		}
		for(int i=len-2;i>start;i--){
			matrix[len-1][i]=k;
			k++;
		}
		for(int i=len-1;i>start;i--){
			matrix[i][start]=k;
			k++;
		}
		matrix(matrix,start+1,len-1,k);
		
	}
}
