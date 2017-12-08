package Test;

import java.util.Arrays;
import java.util.Scanner;

public class  A {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 String[] sts=s.nextLine().split(" ");
		 int n=sts.length;
		 int[] nums=new int[n];
		 int[] arrNums=new int[n];
		 int times=0;
		 for (int i = 0; i < n; i++) {
			 int a=Integer.parseInt(sts[i]);
			 nums[i]=a;
			 arrNums[i]=a;
		}
		 Arrays.sort(arrNums);
		 for (int i = 0; i < nums.length; i++) {
			if(nums[i]==arrNums[i]) continue;
			for (int j = i+1; j < arrNums.length; j++) {
				if(arrNums[i]==nums[j]&&arrNums[j]==nums[i])
					{times++;
					int a=nums[j];
					nums[j]=nums[i];
					nums[i]=a;
					}
			}
			if(nums[i]!=arrNums[i])
			for (int j = i+1; j < arrNums.length; j++) {
				if(arrNums[i]==nums[j])
				{times++;
				int a=nums[j];
				nums[j]=nums[i];
				nums[i]=a;
				}
			}
		}
		 System.out.println(times);
		 
	}
}