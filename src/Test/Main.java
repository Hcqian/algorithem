package Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	class line{
		public int start;
		public int end;
		line(int start,int end){
			this.start=start;
			this.end=end;
		}
	}
	
	public int merge(List<line> list){
//		list.sort((line l1,line l2)->{return Integer.compare(l2.start, l1.start);});
		List<line> l=new ArrayList<>();
		for (line line : list) {
			for (int j = l.size()-1;  j>=0; j--) {
				line jl=l.get(j);
				if(line.start<=jl.end){
					line.end=Math.min(jl.end, jl.end);
				}
				l.remove(j);
			}
			l.add(line);
		}
		return l.size();
	}
	
	public static void main(String[] args) {
		Main m=new Main();
		List<line> list=new ArrayList<>();
		list.add(m.new line(0, 4));
		list.add(m.new line(2, 5));
		list.add(m.new line(4, 6));
		list.add(m.new line(-8, -9));
		System.out.println(m.merge(list));
	}
}
