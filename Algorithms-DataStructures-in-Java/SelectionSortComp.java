//Program to implement Selection Sort

import java.util.Arrays;

public class SelectionSortComp {

	public void exch(Comparable a[], int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public void selectionSort(Comparable a[]) {

		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i; j < a.length; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			exch(a, i, min);
		}

	}

	public static void main(String[] args) {

		Comparable sortArray[] = { 45, 12, 65, 19, 18, 12, 34, 67, 15, 68, 15,
				17, 16, 98, 57, 45 };
		SelectionSortComp obj = new SelectionSortComp();
		obj.selectionSort(sortArray);
		System.out.println(Arrays.toString(sortArray));
	}
}
