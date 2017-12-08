package Lintcode;

public class HousePaint {
	public int minCost(int[][] costs) {
		// Write your code here
		if(costs.length==0) return 0;
		int[][] minCost = new int[costs.length][3];
		for (int i = 0; i < minCost.length; i++) {
			if (i == 0) {
				minCost[0][0] = costs[0][0];
				minCost[0][1] = costs[0][1];
				minCost[0][2] = costs[0][2];
			}else {
				minCost[i][0]=costs[i][0]+Math.min(minCost[i-1][1], minCost[i-1][2]);
				minCost[i][2]=costs[i][2]+Math.min(minCost[i-1][1], minCost[i-1][0]);
				minCost[i][1]=costs[i][1]+Math.min(minCost[i-1][0], minCost[i-1][2]);
			}
		}
		return Math.min(minCost[costs.length][0], Math.min(minCost[costs.length][1], minCost[costs.length][2]));
	}
}
