package algorithm;

import java.util.ArrayList;
import java.util.List;

public class SpiralM54 {
	List<Integer> list =new ArrayList<>();
	public List<Integer> spiralOrder(int[][] matrix) {
		if(matrix.length==0){
			return list;
		}
		spiral(0, matrix.length,matrix[0].length, matrix);
		return list;
	}
	public void spiral(int start,int m,int n, int[][] matrix){
		if(start>=n||start>=m) return;
		if(m==1&&n==1){
			list.add(matrix[m-1][n-1]);
			return;
		}
		for(int j=start;j<n;j++){
			list.add(matrix[start][j]);
		}
		for(int j=start+1;j<m-1;j++){
			list.add(matrix[j][n-1]);
		}
		for(int j=n-1;j>=start&&(m-1)>start;j--){
			list.add(matrix[m-1][j]);
		}
		for(int j=m-2;j>start&&start<(n-1);j--){
			list.add(matrix[j][start]);
		}
		spiral(start+1, m-1,n-1, matrix);
	}
	
}
