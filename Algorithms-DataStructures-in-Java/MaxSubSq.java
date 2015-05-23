//Program to find Maximum Sub Sequence - > Dynamic Programming

public class MaxSubSq {

	static int s[];

	private int maxSubSequence(int seq[], int i) {

		if (i == 0) {
			return s[0];
		} else {
			return s[i - 1] + seq[i];
		}

	}

	public static void main(String[] args) {
		int seq[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		MaxSubSq maxSubSq = new MaxSubSq();
		s = new int[seq.length];

		s[0] = seq[0];

		for (int i = 1; i < seq.length; i++) {
			// Useless function call, everything is solvable using
			// s[i] = ((s[i-1]+seq[i])>=(seq[i]))?(s[i-1]+seq[i]):(seq[i]);
			
			s[i] = Math.max(maxSubSq.maxSubSequence(seq, i), seq[i]);
		}

		int max = 0, pos = 0;
		for (int i = 0; i < seq.length; i++) {
			if (s[i] > s[max])
				max = i;
		}

		for (int i = max; i >= 0; i--) {
			if (s[i] == seq[i]) {
				pos = i;
				break;
			}
		}

		System.out.println("Largest Subsequence is :   ");
		for (int i = pos; i <= max; i++) {
			System.out.print(seq[i] + "\t");
		}

	}
}
