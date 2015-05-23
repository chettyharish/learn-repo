//Program to implement Merge Sort

import java.util.Arrays;

public class MergeSortComp {
	Comparable aux[];

	public boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public void merge(Comparable a[], Comparable aux[], int lo, int mid, int hi) {
		

		for (int i = lo; i <= hi; i++) {
			aux[i] = a[i];
		}
		
		int i = lo, j = mid + 1;

		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				a[k] = aux[j++];
			} else if (j > hi) {
				a[k] = aux[i++];
			} else if (less(aux[i], aux[j])) {
				a[k] = aux[i++];
			} else {
				a[k] = aux[j++];
			}
		}
	}

	public void mergeSort(Comparable a[], Comparable aux[], int lo, int hi) {
		if (hi <= lo)
			return;

		int mid = lo + (hi - lo) / 2;
		mergeSort(a, aux, lo, mid);
		mergeSort(a, aux, mid + 1, hi);
		merge(a, aux, lo, mid, hi);
	}

	public void sort(Comparable a[]) {
		aux = new Comparable[a.length];
		mergeSort(a, aux, 0, a.length-1);
	}

	public static void main(String[] args) {

		Comparable sortArray[] = { 45, 12, 65, 19, 18, 12, 34, 67, 15, 68, 15,
				17, 16, 98, 57, 45 };
		MergeSortComp obj = new MergeSortComp();
		obj.sort(sortArray);
		System.out.println(Arrays.toString(sortArray));
	}

}
