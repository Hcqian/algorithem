package algorithm;

public class SurroundedRegions130 {
	char[][] board;
	int ilen;
	int jlen; 
	public void solve(char[][] board) {
		this.board=board;
		ilen=board.length;
		if(ilen==0) return;
		jlen=board[0].length;
			for (int j = 0; j < (jlen>ilen?jlen:ilen); j++) {
				if(j<jlen&&board[0][j]=='O') find(0,j);
				if(j<jlen&&board[ilen-1][j]=='O') find(ilen-1,j);
				if(j<ilen&&board[j][0]=='O') find(j,0);
				if(j<ilen&&board[j][jlen-1]=='O') find(j,jlen-1);
		}
			for (int i = 0; i < ilen; i++) {
				for (int j = 0; j < jlen; j++) {
					if(board[i][j]=='O') board[i][j]='X';
					if(board[i][j]=='1') board[i][j]='O';
				}
			}
	}
	public void find(int i,int j){
		board[i][j]='1';
		if(j+1<jlen&&board[i][j+1]=='O') find(i,j+1);
		if(i+1<ilen&&board[i+1][j]=='O') find(i+1,j);
		if(j>0&&board[i][j-1]=='O') find(i,j-1);
		if(i>0&&board[i-1][j]=='O') find(i-1,j);
	}
}
