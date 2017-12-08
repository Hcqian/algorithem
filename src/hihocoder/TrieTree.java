package hihocoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrieTree {
	public static void main(String[] arg) {
		Scanner in=new Scanner(System.in);
		int index=in.nextInt();
		Node root=new TrieTree.Node(' ');
		Node temp=new TrieTree.Node(' ');
		in.nextLine();
		for (int i = 0; i < index; i++) {
			String s=in.nextLine();
			Node n=root;
			for (int j = 0; j < s.length(); j++) {
				temp.name=s.charAt(j);
				int r=n.children.indexOf(temp);
				if(r!=-1){
					n=n.children.get(r);
					n.count++;
				}else {
					Node t=new TrieTree.Node(s.charAt(j));
					n.children.add(t);
					n=t;
				}
			}
			
		}
		index=in.nextInt();
		in.nextLine();
		for (int i = 0; i < index; i++) {
			String s=in.nextLine();
			Node n=root;
			for (int j = 0; j < s.length(); j++) {
				temp.name=s.charAt(j);
				int r=n.children.indexOf(temp);
				if(r==-1){
					System.out.println(0);
					break;
				}else {
					Node t=n.children.get(r);
					n=t;
				}
				if(j==s.length()-1)
					System.out.println(n.count);
			}
			
		}
	}
	static class Node{
		char name;
		int count=1;
		List<Node> children;
		Node(char c){
			children=new ArrayList<>();
			name=c;
		}
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			Node n=(Node) obj;
			
			return this.name==n.name;
		}
		
	}

}
