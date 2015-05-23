//Program to implement Shuffling

import java.util.Arrays;
import java.util.Random;

public class ShuffleSort {

	public boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public void exch(Comparable a[], int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void shuffle(Comparable a[]) {
		Random r = new Random();

		for (int i = 0; i < a.length; i++) {
			int j = r.nextInt(a.length - 1);
			exch(a, i, j);

		}
	}

	public static void main(String[] args) {

		Comparable sortArray[] = { 10, 20, 30, 40, 50, 60, 70 };
		ShuffleSort obj = new ShuffleSort();
		obj.shuffle(sortArray);
		System.out.println(Arrays.toString(sortArray));

	}

}
