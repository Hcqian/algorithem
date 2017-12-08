package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII210 {
	public int[] findOrder(int numCourses, int[][] prerequisites) {
		List<Integer>[] list=new List[numCourses];
		int[] order=new int[numCourses];
		int[] count=new int[numCourses];
		for (int i = 0; i < numCourses; i++) {
			list[i]=new ArrayList<>();
		}
		for (int i = 0; i < prerequisites.length; i++) {
			list[prerequisites[i][1]].add(prerequisites[i][0]);
			count[prerequisites[i][0]]++;
		}
		int counts=0;
		Queue<Integer> q=new LinkedList<>();
		for (int i = 0; i < count.length; i++) {
			if(count[i]==0){ order[counts++]=i;
			q.add(i);}
		}
		while(!q.isEmpty()){
			int a=q.poll();
			for (Integer integer : list[a]) {
				if(--count[integer]!=0) continue;
				q.add(integer);
				order[counts++]=integer;
			}
			
		}
		if(counts!=numCourses) return new int[0];
		return order;
	}
}
