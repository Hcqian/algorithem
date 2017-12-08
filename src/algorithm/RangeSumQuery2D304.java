package algorithm;

public class RangeSumQuery2D304 {
	private int[][] sum;
	public void NumMatrix(int[][] matrix) {
		if(matrix.length==0) return;
		int len=matrix[0].length;
		sum=new int[matrix.length][len];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < len; j++) {
				int ai=Math.max(0, i-1),aj=Math.max(0,j-1);
				if(i==0||j==0)
				sum[i][j]=matrix[i][j]+sum[ai][j]+sum[i][aj];
				else 
					sum[i][j]=matrix[i][j]+sum[ai][j]+sum[i][aj]-sum[ai][aj];	
			}
		}
	}

	public int sumRegion(int row1, int col1, int row2, int col2) {
		if(row1==0&&col1!=0) return sum[row2][col2]-sum[row2][col1-1];
		if(row1!=0&&col1==0) return sum[row2][col2]-sum[row1-1][col2];
		if(row1==0&&col1==0) return sum[row2][col2];
		return sum[row2][col2]-sum[row2][col1-1]-sum[row1-1][col2]+sum[row1-1][col1-1];
	}

}
