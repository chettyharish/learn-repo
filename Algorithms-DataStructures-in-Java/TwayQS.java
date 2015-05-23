//Program to implement 3 way quick sort

import java.util.Arrays;

public class TwayQS {

	public void sort(String a[]) {
		sort(a, 0, a.length - 1, 0);
	}

	public void sort(String a[], int lo, int hi, int d) {

		if (hi <= lo)
			return;

		int lt = lo, gt = hi, i = lo + 1;
		int v = charAt(a[lo], d);

		while (i <= gt) {
			int t = charAt(a[i], d);

			if (t < v)
				exch(a, lt++, i++);
			else if (t > v)
				exch(a, gt--, i);
			else if (t == v)
				i++;
		}

		sort(a, lo, lt - 1, d);
		if (v >= 0)
			sort(a, lt, gt, d + 1);
		sort(a, gt + 1, hi, d);

	}

	public int charAt(String a, int d) {
		if (d < a.length())
			return a.charAt(d);
		return -1;
	}

	public void exch(String a[], int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		TwayQS p = new TwayQS();
		String a[] = { "cat", "dog", "man", "fan", "lan", "zen", "pen", "run",
				"rod", "lad", "fad", "dad", "mad", "sad", "pad", "bad", "cat",
				"dog", "man", "fan", "lan", "zen", "pen", "run", "rod", "lad",
				"fad", "dad", "mad", "sad", "pad", "bad", "cat", "dog", "man",
				"fan", "lan", "zen", "pen", "run", "rod", "lad", "fad", "dad",
				"mad", "sad", "pad", "bad", "cat", "dog", "man", "fan", "lan",
				"zen", "pen", "run", "rod", "lad", "fad", "dad", "mad", "sad",
				"pad", "bad" };

		p.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
