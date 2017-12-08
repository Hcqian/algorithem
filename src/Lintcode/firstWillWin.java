package Lintcode;


public class firstWillWin {
	public boolean firstWillWin(int n) {
		int num=n%3;
		if(num==0)
			return false;
		return true;
    }
}
