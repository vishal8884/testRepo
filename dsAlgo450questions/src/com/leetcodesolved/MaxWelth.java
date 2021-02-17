package com.leetcodesolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MaxWelth {

	public static void main(String[] args) {

		int[][] arr = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
		maximumWealth(arr);
	}

	public static int maximumWealth2(int[][] accounts) {

		int maxRowSum = 0;
		int rowSum = 0;
		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts[0].length; j++)
				rowSum += accounts[i][j];
			if (rowSum > maxRowSum)
				maxRowSum = rowSum;
			rowSum = 0;
		}
		return maxRowSum;
	}

	public static int maximumWealth(int[][] arr) {

		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;

			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];

			}
			System.out.println("sum ::" + sum);
			if (sum > max) {
				max = sum;
			}
		}

		System.out.println(max);
		return max;
	}

}
