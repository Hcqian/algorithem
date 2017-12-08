package algorithm;

public class FirstBadVersion278 {
	boolean isBadVersion(int version){
		return version>1702766718;
	}
	public int firstBadVersion(int n) {
		int l=1,r=n,mid=0;
		while(l<r){
			mid=l+(r-l)/2;
			if(isBadVersion(mid)){
				r=mid-1;
			}else {
				l=mid+1;
			}
		}
		return isBadVersion(l)? l:l+1;
		
	}
}
