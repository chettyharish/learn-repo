//Program to implement Quick Sort

import java.util.Arrays;

public class QuickSortCompEqual {

	public void exch(Comparable a[], int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void quickSort(Comparable a[], int lo, int hi) {

		if (hi <= lo)
			return;

		int lt = lo, gt = hi, i = lo;
		Comparable v = a[lo];

		while (i <= gt) {
			int cmp = a[i].compareTo(v);
			if (cmp < 0)
				exch(a, i++, lt++);
			else if (cmp > 0)
				exch(a, gt--, i);
			else
				i++;
		}
		quickSort(a, lo, lt - 1);
		quickSort(a, gt + 1, hi);
	}

	public static void main(String[] args) {

		Comparable sortArray[] = { 45, 12, 45, 19, 45, 12, 45, 67, 15, 45, 15,
				45, 16, 45, 57, 45 };
		QuickSortCompEqual obj = new QuickSortCompEqual();
		obj.quickSort(sortArray, 0, sortArray.length - 1);
		System.out.println(Arrays.toString(sortArray));
	}

}
