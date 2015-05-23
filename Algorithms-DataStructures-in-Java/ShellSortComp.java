//Program to implement Shell Sort

import java.util.Arrays;
import java.util.Random;

public class ShellSortComp {

	public void exch(Comparable a[], int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public void shellSort(Comparable a[]) {
		int h = 1;
		while (h < a.length / 3)
			h = 3 * h + 1;

		while (h >= 1) {
			for (int i = h; i < a.length; i++) {
				for (int j = i; j >= h && less(a[j], a[j - h]); j = j - h) {
					exch(a, j, j - h);
				}
			}
			h = h / 3;
		}
	}

	public static void main(String args[]) {

		long start = System.currentTimeMillis();
		Random r = new Random();

		Comparable sortArray[] = new Comparable[100];

		for (int i = 0; i < sortArray.length; i++) {
			sortArray[i] = r.nextInt(50);
		}

		ShellSortComp obj = new ShellSortComp();
		System.out.println(Arrays.toString(sortArray));
		System.out.println("Hello");
		obj.shellSort(sortArray);		
		System.out.println(Arrays.toString(sortArray));
		System.out.println((System.currentTimeMillis() - start)/1000);
	}

}
