//Program to find Divide contiguous array in two parts - > Dynamic Programming

public class MinSumPartition {

	public static void main(String[] args) {
		int arr[] = { 3, 1, 1, 2, 2, 1, 9 };
		int sum1 = 0, sum2 = 0, diff = 0, pos = 0;
		sum1 = arr[0];
		sum2 = 0;
		for (int i = 1; i < arr.length; i++) {
			sum2 += arr[i];
		}
		diff = Math.abs(sum1 - sum2);
		pos = 0;

		for (int i = 1; i < arr.length; i++) {
			// adding the next element to first set and removing from second set
			sum1 = sum1 + arr[i];
			sum2 = sum2 - arr[i];

			if (diff > Math.abs(sum1 - sum2)) {
				diff = Math.abs(sum1 - sum2);
				pos = i;
			}
		}
		System.out.println(pos);
	}

}
