//Program to implement Quick Sort

import java.util.Arrays;
import java.util.Random;

public class QuickSortComp {

	public void randomArray(Comparable a[]) {
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			int j = r.nextInt(a.length - 1);
			exch(a, i, j);
		}

	}

	public boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public void exch(Comparable a[], int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public int partition(Comparable a[], int lo, int hi) {

		int i = lo;
		int j = hi + 1;

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
		exch(a, lo, j);
		return j;

	}

	public void sort(Comparable a[], int lo, int hi) {

		if (hi <= lo)
			return;
		int j = partition(a, lo, hi);
		sort(a, lo, j - 1);
		sort(a, j + 1, hi);
	}

	public void quickSort(Comparable a[]) {
		randomArray(a);
		sort(a, 0, a.length - 1);
	}

	public static void main(String[] args) {

		Comparable sortArray[] = { 45, 12, 65, 19, 18, 12, 34, 67, 15, 68, 15,
				17, 16, 98, 57, 45 };
		QuickSortComp obj = new QuickSortComp();
		obj.quickSort(sortArray);
		System.out.println(Arrays.toString(sortArray));
	}

}
