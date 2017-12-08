package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BasicCalculator224 {
	// public int calculate(String s) {
	// Stack<Integer> stack = new Stack<>();
	// int[] num=new int[s.length()/2+1];
	// char[] cr=new char[s.length()/2+1];
	// int k=0,t=0;
	// String subs = "";
	// for (int i = 0; i < s.length(); i++) {
	// char c = s.charAt(i);
	// if (c == ' ')
	// continue;
	// if (c == '(') {
	// stack.push(k);
	// }else if (c == ')') {
	// if(!subs.equals(""))
	// {num[k++]=Integer.parseInt(subs);
	// subs="";}
	// int j = stack.pop();
	// compute(cr, num, j,t);
	// t=j;
	// k=j+1;
	//
	// }else if(c>='0'&&c<='9'){
	// subs+=c;
	// }else {
	// cr[t++]=c;
	// if(!subs.equals("")){
	// num[k++]=Integer.parseInt(subs);
	// subs="";}
	// }
	// }
	// if(!subs.equals(""))
	// num[k]=Integer.parseInt(subs);
	// compute(cr, num, 0,t);
	// return num[0];
	// }
	//
	// public void compute(char[] c,int[] nums,int j,int t) {
	// for (int i = j; i < t;i++) {
	// if(c[i]=='+') nums[j]+=nums[i+1];
	// else {
	// nums[j]-=nums[i+1];
	// }
	// }
	// }
	public int calculate(String s) {
		char[] cs=s.toCharArray();
		int[] i={0};
		return compute(cs,i);
			}
	public int compute(char[] cs,int[] i){
		int num=0;
		int value=0;
		byte op=1;
		for (; i[0] < cs.length; i[0]++) {
			switch (cs[i[0]]) {
			case '(':
				i[0]++;
				value=value+op*compute(cs,i);
				i[0]--;
				break;
			case ')':
				i[0]++;
				value=value+op*num;
				return value;
			case ' ':
				continue;
			case '+':
				value=value+op*num;
				num=0;
				op=1;
				break;
			case '-':
				value=value+op*num;
				num=0;
				op=-1;
				break;

			default:
				num=num*10+(cs[i[0]]-'0');
				break;
			}
		}
		if(num!=0)
			value=value+op*num;
		return value;
	}
}
