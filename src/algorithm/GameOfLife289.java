package algorithm;
/*
 * 0 dead->dead
 * 2 dead->live
 * 1 live->live
 * 3 live->dead
 * 
 * */
public class GameOfLife289 {
	public void gameOfLife(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				neighbors(i, j, board);
			}
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j]==2) board[i][j]=1;
				if(board[i][j]==3) board[i][j]=0;
			}
		}

	}
	
	
	public void neighbors(int i,int j,int[][] board){
		int count=0;
		if(i>=1){
			if(j>=1&&board[i-1][j-1]%2==1) count++;
			if(board[i-1][j]%2==1) count++;
			if(j+1<board[i].length&&board[i-1][j+1]%2==1) count++;
		}
		if(i+1<board.length){
			if(j>=1&&board[i+1][j-1]%2==1) count++;
			if(board[i+1][j]%2==1) count++;
			if(j+1<board[i].length&&board[i+1][j+1]%2==1) count++;
		}
		if(j>=1&&board[i][j-1]%2==1)count++;
		if(j+1<board[i].length&&board[i][j+1]%2==1) count++;
		
		if(board[i][j]%2==0){
			if(count==3) board[i][j]=2;
		}else {
			if(count<2||count>3) board[i][j]=3;
		}
	}
}
