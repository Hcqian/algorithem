package algorithm;

import java.util.List;

public class WordBreak139 {
	public boolean wordBreak(String s, List<String> wordDict) {
		if (s == null || s.length() == 0)
			return false;
		boolean judge[] = new boolean[s.length() + 1];
		judge[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (judge[j] && wordDict.contains(s.substring(j, i)))
					judge[i] = true;
			}

		}
		return judge[judge.length - 1];
	}

}
