package com.leetcodesolved;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 7, 11 };
		System.out.println(findKthPositive2(arr, 5) + " sol");
	}

	public static int findKthPositive(int[] arr, int k) {

		int c = 0;
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		System.out.println(list);

		for (int j = 1; j < Integer.MAX_VALUE; j++) {
			if (!(list.contains(j))) {

				c++;
				System.out.println(j + " c::" + c);
				if (c == k) {
					return j;
				}

			}
		}

		System.out.println(Integer.MAX_VALUE + " val");
		return 0;
	}

	public static int findKthPositive2(int[] nums, int k) {

		System.out.println(Arrays.toString(nums));
		int left = 0, right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
             System.out.println("mid ::"+mid);
			if (nums[mid] - mid <= k) {
				left = mid + 1;
				System.out.println("left ::"+left);
			} else {
				right = mid - 1;
				System.out.println("right ::"+right);
			}
		}

		return left + k;
	}
}