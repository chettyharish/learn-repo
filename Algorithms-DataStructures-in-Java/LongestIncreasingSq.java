//Program to find Longest Increasing Sub Sequence - > Dynamic Programming

public class LongestIncreasingSq {

	public static void main(String[] args) {
		int seq[] = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		int ls[] = new int[seq.length];

		ls[0] = 1;

		for (int i = 1; i < ls.length; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (seq[i] > seq[j] && ls[j] > max) {
					max = ls[j];
				}
			}
			if (max == 0)
				// All elements are greater than current
				ls[i] = 1;
			else
				ls[i] = max + 1;
		}

	}

}
