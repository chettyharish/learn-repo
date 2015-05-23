//Program to implement Merge Sort

import java.util.Arrays;

public class MergeSortCompNon {

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
			if (i > mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[i++];
			else if (less(aux[i], aux[j]))
				a[k] = aux[i++];
			else
				a[k] = aux[j++];
		}
	}

	public void mergeSort(Comparable a[]) {
		aux = new Comparable[a.length];

		for (int size = 1; size < a.length; size = 2 * size) {
			for (int i = 0; i < a.length - size; i = i + size) {
				merge(a, aux, i, i + size - 1,
						Math.min(i + size + size - 1, a.length - 1));
			}

		}
	}

	public static void main(String[] args) {

		Comparable sortArray[] = { 45, 12, 65, 19, 18, 12, 34, 67, 15, 68, 15,
				17, 16, 98, 57, 45 };
		MergeSortComp obj = new MergeSortComp();
		obj.sort(sortArray);
		System.out.println(Arrays.toString(sortArray));
	}
}
