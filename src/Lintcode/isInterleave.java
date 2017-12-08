package Lintcode;


public class isInterleave {
	char[] ss3;
	char[] ss2;
	char[] ss1;

	public boolean isInterleave(String s1, String s2, String s3) {
		// write your code here
		ss3 = s3.toCharArray();
		ss2 = s2.toCharArray();
		ss1 = s1.toCharArray();
		if(s1.length()==0&&s2.length()==0&&s3.length()==0) return true;
		boolean[][] chars = new boolean[s2.length() + 1][s1.length() + 1];
		chars[0][0]=true;
		for (int i = 1; i <=s1.length(); i++) {
			if(ss1[i-1]==ss3[i-1]) chars[0][i]=true;
			else break;
		}
		for (int i = 1; i <=s2.length(); i++) {
			if(ss2[i-1]==ss3[i-1]) chars[i][0]=true;
			else break;
		}
		for (int i = 1; i <=s2.length(); i++) {
			for (int j = 1; j <=s1.length(); j++) {
				if(ss3[i+j-1]==ss2[i-1])
					chars[i][j]=chars[i-1][j];
				if(ss3[i+j-1]==ss1[j-1])
					chars[i][j]=chars[i][j]||chars[i][j-1];
			}
		}
		return chars[s2.length()][s1.length()];
	}

	// 指数级别解法
	public boolean find(int s1, int s2, int s3) {
		if (s3 == ss3.length)
			return true;
		boolean flag = false;
		if (s1 < ss1.length && ss1[s1] == ss3[s3]) {
			flag = find(s1 + 1, s2, s3 + 1);
		}
		if (flag)
			return flag;
		if (s2 < ss2.length && ss2[s2] == ss3[s3]) {
			flag = find(s1, s2 + 1, s3 + 1);
		}
		return flag;
	}
}
