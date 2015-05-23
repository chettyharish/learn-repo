//Program to find MaxMin -> Dynamic Programming

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		MaxMin obj = new MaxMin();
		int arr[] = { 5, 9, 51, 8, 2, 3, 4, 5, 9, -9, 2, 7, 3, 6, 4, 5 };

		System.out.println(Arrays.toString(obj.findMaxMin(arr, 0,
				arr.length - 1)));

	}

	private int[] findMaxMin(int[] arr, int i, int j) {

		int result1[] = new int[2];
		int result2[] = new int[2];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		if (i == j) {
			max = min = arr[i];
		} else if (i == j - 1) {
			if (arr[i] < arr[j]) {
				max = arr[j];
				min = arr[i];
			} else {
				max = arr[i];
				min = arr[j];
			}
		} else {
			int mid = (i + j) / 2;
			result1 = findMaxMin(arr, 0, mid);
			result2 = findMaxMin(arr, mid + 1, j);

			if (result1[0] > result2[0])
				max = result1[0];
			else
				max = result2[0];

			if (result1[1] < result2[1])
				min = result1[1];
			else
				min = result2[1];

		}

		result1[0] = max;
		result1[1] = min;
		return result1;

	}

}
