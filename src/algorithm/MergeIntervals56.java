package algorithm;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals56 {
	public class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> list=new ArrayList<>();
		for (Interval interval : intervals) {
			int len=list.size();
			for (int j = len-1; j>=0; j--) {
				Interval i=list.get(j);
				if(isOverLapp(interval,i)){
					interval.start=Math.min(interval.start, i.start);
					interval.end=Math.max(interval.end, i.end);
					list.remove(j);
				}
			}
			list.add(interval);
		}
		return list;
	}
	public boolean isOverLapp(Interval i,Interval j)
	{
		if(i.end<j.start||j.end<i.start) return false;
		return true;
	}
}
