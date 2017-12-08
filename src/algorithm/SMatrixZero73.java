package algorithm;

import java.util.HashSet;
import java.util.Set;

public class SMatrixZero73 {
	public void setZeroes(int[][] matrix) {
		int m=matrix.length;
		int n=matrix[0].length;
		boolean falg=false;
		int[][] b=new int[m][n];
		Set<Integer> set=new HashSet<>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(matrix[i][j]==0){
					falg=true;
					set.add(j);
				}
			}
			if(set.size()==n){break;}
			if(falg){
				matrix[i]=b[0];
				falg=false;
			}

		}
		for(Integer j:set){
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][j]=0;
			}
		}
	}
}
