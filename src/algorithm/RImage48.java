package algorithm;

public class RImage48 {
	public void rotate(int[][] matrix) {
		if(matrix==null) return;
		int a[][] = new int[matrix.length][matrix.length];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				a[i][matrix.length-j-1]=matrix[j][i];
			}
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				matrix[j][i]=a[j][i];
			}
		}
	}
}
