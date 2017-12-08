package algorithm;

import java.util.Arrays;

public class BullsCows299 {
	public String getHint(String secret, String guess) {
		int bulls = 0, cows = 0;
		char[] Csecret = secret.toCharArray();
		char[] Cguess = guess.toCharArray();
		int[] count=new int[10];
		for (int i = 0; i < secret.length(); i++) {
			if (Cguess[i] == Csecret[i])
				bulls++;
			else {
				count[Cguess[i]-'0']--;
				count[Csecret[i]-'0']++;
			}
		}
		for (int i = 0; i < count.length; i++) {
			if(count[i]>0) cows+=count[i];
		}
		cows=Cguess.length-cows-bulls;
		

//		for (int i = 0; i < secret.length(); i++) {
//			if (Cguess[i] == Csecret[i])
//				bulls++;
//		}
//		Arrays.sort(Csecret);
//		Arrays.sort(Cguess);
//		for (int i = 0, j = 0; i < Cguess.length&&j<Cguess.length;) {
//			if (Csecret[i] == Cguess[j]) {
//				i++;
//				j++;
//				cows++;
//			} else if (Csecret[i] < Cguess[j]) {
//				i++;
//			} else {
//				j++;
//			}
//		}
//		cows-=bulls;
		return bulls+"A"+cows+"B";
	}
}
