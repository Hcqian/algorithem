package algorithm;

import java.util.Scanner;

public class mianshi  {
	public static void main(String[] arg){
		//Scanner s=new Scanner(System.in);
		int n=3;//s.nextInt();
		int k=10;//s.nextInt();
		long num=0;
		boolean[][] d=new boolean[k+1][k+1];
		int[] a=new int[k+1];
		int[] b=new int[k+1];
		int[] c=new int[k+1];
		for (int i = 1; i <= k; i++) {
			b[i]=1;
			a[i]=k-i+1;
			for (int j = 1; j <i; j++) {
				if(i%j!=0){a[i]++;}else {
					d[i][j]=true;
				}
			}
		}
		for (int i = 1; i < n-1; i++) {
			for (int j = 1; j <= k; j++) {
				if(b[j]!=0){
					for (int j2 = 1; j2 <= k; j2++) {
						if(!d[j][j2])
						c[j2]+=b[j];
					}
					b[j]=0;
				}
			}
			int[] t=b;
			b=c;
			c=t;
		}
		for (int i = 1; i < c.length; i++) {
			num+=b[i]*a[i];
		}
		System.out.println(num);
	}
}
