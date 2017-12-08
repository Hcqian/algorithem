package algorithm;

class longestCommonSubsequence {
	public int longestCommonSubsequence(String A, String B) {
		// write your code here
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();
		int[][] matrix = new int[2][B.length() + 1];
		for (int i = 1; i <= A.length(); i++) {
			for (int j = 1; j <= B.length(); j++) {
				if (a[i - 1] == b[j - 1]) {
					matrix[i % 2][j] = matrix[(i - 1) % 2][j - 1] + 1;
				} else {
					matrix[i % 2][j] = Math.max(matrix[(i - 1) % 2][j], matrix[i % 2][j - 1]);
				}
			}
		}
		return Math.max(matrix[0][B.length()], matrix[1][B.length()]);
	}
}
