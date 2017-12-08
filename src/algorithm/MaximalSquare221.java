package algorithm;

public class MaximalSquare221 {
	public int maximalSquare(char[][] matrix) {
		if (matrix.length == 0)
			return 0;
		int h = matrix.length;
		int w = matrix[0].length;
		int[][] inmatrix = new int[h][w];
		int max = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				inmatrix[i][j] = matrix[i][j] - '0';
				if (i > 0 && j > 0) {
					int min = Math.min(inmatrix[i - 1][j],inmatrix[i][j - 1]);
					inmatrix[i][j]=inmatrix[i][j]==0? 0:min+1;
				}
				max=Math.max(max,inmatrix[i][j]);
			}
		}
		for (int[] is : inmatrix) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		return max*max;

	}

}
