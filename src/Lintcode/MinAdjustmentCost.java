package Lintcode;

import java.util.List;

public class MinAdjustmentCost {
	public int MinAdjustmentCost(List<Integer> A, int target) {
        // write your code here
		int max=0;
		for (Integer integer : A) {
			max=Math.max(max, integer);
		}
		int minAdjust=Integer.MAX_VALUE;
		int[][] a=new int[max][A.size()];
		for (int i = 0; i < a.length; i++) {
			int minA=0;
			for (int j = 0; j < a[0].length; j++) {
				int c=A.get(j);
				if(j==0) a[i][j]=i+1;
				else {
					if(Math.abs(a[i][j-1]-c)>target){
						if(c>a[i][j-1]) a[i][j]=a[i][j-1]+target;
						else {
							a[i][j]=a[i][j-1]-target;
						}
					}else {
						a[i][j]=c;
					}
				}
				System.out.print(a[i][j]+" ");
				minA+=Math.abs(c-a[i][j]);
			}
			System.out.println();
			minAdjust=Math.min(minAdjust, minA);
		}
		
		return minAdjust;
    }
}
