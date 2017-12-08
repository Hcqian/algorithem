package hihocoder;

import java.util.Scanner;

public class KMP {
	private String pat;
	private int[][] dfa;
	
	public KMP(String pat){
	//构造DFA
		this.pat=pat;
		int m=pat.length();
		int r=256;
		dfa=new int[r][m];
		dfa[pat.charAt(0)][0]=1;
		for (int x = 0,j=1; j < m; j++) {
			//计算[][j]
			for (int c = 0; c < r; c++) {
				dfa[c][j]=dfa[c][x];
			}
			dfa[pat.charAt(j)][j]=j+1;
			x=dfa[pat.charAt(j)][x];
		}
	}
	public static void main(String[] arg){
		
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int[] next=new int[num];
	}
	public int search(String txt){
		int i,j,n=txt.length(),m=pat.length();
		for (i = 0,j= 0; i < n&&j<m; i++) 
			j=dfa[txt.charAt(i)][j];
		if(j==m) return i-m;
		else return n;
	}
}
