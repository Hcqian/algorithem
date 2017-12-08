package algorithm;

public class H_IndexII275 {
	public int hIndex(int[] citations) {
		
        int h=citations.length-1,len=h,l=0,mid=(h+l)/2;
        while(h<=l){
        	if(citations[mid]==len-mid){
        		return citations[mid];
        	}else if(citations[mid]>len-mid){
        		h=mid-1;
			}else if(citations[mid]<len-mid){
				l=mid+1;
			}
        }
        return len-h-1;
    }

}
