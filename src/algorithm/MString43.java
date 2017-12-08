package algorithm;

public class MString43 {
	public String multiply(String num1,String num2){
		int len1=num1.length();
		int len2=num2.length();
		int[] b=new int[len1+len2];
		for(int i=len1-1;i>=0;i--){
			for(int j=len2-1;j>=0;j--){
				int p1=i+j,p2=i+j+1;
				int num=(num1.charAt(i)-'0')*(num2.charAt(i)-'0')+b[p2];
				b[p1]+=num/10;
				b[p2]=num%10;
			}
		}
		StringBuilder sb = new StringBuilder();
	    for(int p : b) if(!(sb.length() == 0 && p == 0)) sb.append(p);
	    return sb.length() == 0 ? "0" : sb.toString();
		
	}

}
