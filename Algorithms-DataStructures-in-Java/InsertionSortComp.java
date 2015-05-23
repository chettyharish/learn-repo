//Program to implement Insertion Sort

import java.util.Arrays;

public class InsertionSortComp {

	public boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public void exch(Comparable a[], int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void insertionSort(Comparable a[]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (less(a[j], a[j - 1])) {
					exch(a, j, j - 1);
				} else
					break;
			}
		}
	}

	public static void main(String[] args) {

		Comparable sortArray[] = { 45, 12, 65, 19, 18, 12, 34, 67, 15, 68, 15,
				17, 16, 98, 57, 45 };
		InsertionSortComp obj = new InsertionSortComp();
		obj.insertionSort(sortArray);
		System.out.println(Arrays.toString(sortArray));
	}

}
