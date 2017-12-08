package algorithm;

public class UPathsII63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m=obstacleGrid.length;
		 if(m==0) return 0;
		int n=obstacleGrid[0].length;
        if(m==1&&n==1)  return 1;
        if (obstacleGrid[0][0] == 1)return 0;
       int z=1;
       int k=1;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0) {
					if (obstacleGrid[i][j] == 1){
						k=0;
					}
					obstacleGrid[i][j]=k;	
					System.out.println(obstacleGrid[i][j]);
				}
				if (j == 0&&i!=0) {
					if (obstacleGrid[i][j] == 1){
						z=0;
					}
					obstacleGrid[i][j]=z;	
					System.out.println(obstacleGrid[i][j]);
				}
				if (i != 0 && j != 0){
					if (obstacleGrid[i][j] == 1){
						z=0;
					}else {
						obstacleGrid[i][j] = obstacleGrid[i][j - 1] + obstacleGrid[i - 1][j];}
					}
					

			}
		}
		return obstacleGrid[m-1][n-1]; 
    }
}
