package algorithm;

import java.util.Arrays;

public class KthLargest215 {
	public int findKthLargest(int[] nums, int k) {

		if (nums == null || nums.length == 0) {
			return -1;
		}
		if(k<=10){
			Arrays.sort(nums);
			return nums[nums.length-k-1];
		}
		return quickSelect(nums, 0, nums.length - 1, k);

	}

	private int quickSelect(int[] nums, int start, int end, int k) {

		if (start == end) {
			return nums[start];
		}

		int left = start, right = end;
		int mid = start + (end - start) / 2;
		int pivot = nums[mid];

		while (left <= right) {
			while (left <= right && nums[left] > pivot) {
				left++;
			}
			while (left <= right && nums[right] < pivot) {
				right--;
			}

			if (left <= right) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
				right--;
			}
		}

		if (right + 1 - start >= k) {
			return quickSelect(nums, start, right, k);
		} else if (left + 1 - start <= k) {
			return quickSelect(nums, left, end, k - (left - start));
		} else
			return nums[right + 1];

	}
}
