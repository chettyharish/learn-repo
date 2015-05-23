//Program to implement Heap Sort

import java.util.Arrays;

public class HeapSort {

	int N;

	public boolean less(int a[], int i, int j) {
		return a[i - 1] < a[j - 1];
	}

	public void exch(int a[], int i, int j) {
		int temp = a[i-1];
		a[i - 1] = a[j - 1];
		a[j - 1] = temp;
	}

	public void sink(int a[], int k, int N) {

		while (2 * k <= N) {
			int j = 2 * k;
			if (j < N && less(a, j, j + 1))
				j = j + 1;
			if (less(a, k, j)) {
				exch(a, j, k);
				k = j;
			} else
				break;
		}

	}

	public void heapSort(int a[]) {
		N = a.length;

		for (int k = N / 2; k >= 1; k--) {
			sink(a, k, N);
		}

		while (N > 1) {
			exch(a, 1, N--);
			sink(a, 1, N);
		}

	}

	public static void main(String[] args) {

		int sortArray[] = { 45, 12, 65, 19, 18, 12, 34, 67, 15, 68, 15, 17, 16,
				98, 57, 45 };
		HeapSort obj = new HeapSort();
		obj.heapSort(sortArray);
		System.out.println(Arrays.toString(sortArray));
	}
}
