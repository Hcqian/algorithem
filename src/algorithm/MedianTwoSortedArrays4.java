package algorithm;

public class MedianTwoSortedArrays4 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int len1=nums1.length;
		int len2=nums2.length;
		int total=len1+len2;
		if(total%2==0){
		return (double)(findKth(total/2, nums1,nums2,len1, len2, 0, 0)+findKth(total/2+1, nums1,nums2,len1, len2, 0, 0))/2;	
		}else {
			return findKth(total/2+1, nums1,nums2,len1, len2, 0, 0);
		}		
 	}
	public int findKth(int target,int[] nums1,int[] nums2,int len1,int len2,int l1,int l2){
		if(len1<len2){
			return findKth(target,nums2,nums1,len2, len1,l2,l1);
		}
		//nums1.length>=nums2.length
		if(len2==0){
			return nums1[l1+target-1];
		}
		if(target==1){
			return Math.min(nums2[l2], nums1[l1]);
		}
		int mid2=Math.min(len2, target/2);
		int mid1=target-mid2;
		if(nums1[l1+mid1-1]<nums2[l2+mid2-1]){
			return findKth(target-mid1,nums1,nums2, len1-mid1,len2,l1+mid1,l2);
		}else if(nums1[l1+mid1-1]>nums2[l2+mid2-1]) {
			return findKth(target-mid2,nums1,nums2,len1,len2-mid2,l1,l2+mid2);
		}else {
			return nums1[l1+mid1-1];
		}
	}
}
