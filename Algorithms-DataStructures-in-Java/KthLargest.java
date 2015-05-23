//Program to find kth larges element

import java.util.Arrays;

public class KthLargest {

	public boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public void exch(Comparable a[], int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public int partition(Comparable a[], int lo, int hi) {

		int i = lo, j = hi + 1;
		while (true) {

			while (less(a[++i], a[lo]))
				if (i == hi)
					break;
			while (less(a[lo], a[--j]))
				if (j == lo)
					break;

			if (i >= j)
				break;
			exch(a, i, j);

		}
		exch(a, j, lo);
		return j;
	}

	public Comparable kthfinder(Comparable a[], int lo, int hi,
			int elementNumber) {

		while (hi > lo) {

			int j = partition(a, lo, hi);

			if (j > elementNumber)
				hi = j - 1;
			else if (j < elementNumber)
				lo = j + 1;
			else
				break;
		}
		return a[elementNumber];
	}

	public static void main(String[] args) {
		Comparable sortArray[] = { 45, 12, 65, 19, 18, 12, 34, 67, 15, 68, 15,
				17, 16, 98, 57, 45 };
		KthLargest obj = new KthLargest();

		System.out.println(obj.kthfinder(sortArray, 0, sortArray.length-1, 3));
	}

}
