package algorithm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public class WordLadder127 {
	public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
		if(beginWord.length()==1) return 2;
		if(beginWord.length()==0||wordList.isEmpty()) return 0;
		Set<String> startlist = new HashSet<>();
		Set<String> endlist = new HashSet<>();
		Set<String> slist = new HashSet<>();
		Set<String> temp=null;
		startlist.add(beginWord);
		endlist.add(endWord);
		int times=2;
		    wordList.add(beginWord);
			wordList.remove(beginWord);
		while (!startlist.isEmpty()) {
			if(startlist.size()>endlist.size()){
				temp= startlist;
				startlist=endlist;
				endlist=temp;
			}
			 for(String str:startlist) {
				char[]  word =str.toCharArray();
				for (int i = 0; i < word.length; i++) {
					char old=word[i];
					for (char j = 'a'; j <= 'z'; j++) {
						word[i] = j;
						String sWord=String.valueOf(word);
						if(endlist.contains(sWord)) return times;
						if (wordList.contains(sWord)) {
							wordList.remove(sWord);
							slist.add(sWord);
						}
					}
					word[i]=old;
				}
			}
			times++;
			temp=startlist;
			startlist=slist;
			slist=temp;
			slist.clear();
		}
		return 0;
	}
}
