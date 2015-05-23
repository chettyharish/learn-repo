//Program to find most profitable way to cut rod - > Dynamic Programming

public class RodCutting {

	private int cutRod(int rlength[], int vlength[], int len) {

		if (len <= 0)
			return 0;

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < rlength.length; i++) {
			if (!(len - rlength[i] < 0))
				max = Math
						.max(max,
								vlength[i]
										+ cutRod(rlength, vlength, len
												- rlength[i]));
		}

		return max;

	}

	public static void main(String[] args) {
		int rlength[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int vlength[] = { 3, 5, 8, 9, 10, 17, 17, 20 };

		RodCutting cutting = new RodCutting();

		System.out.println(cutting.cutRod(rlength, vlength, 8));

	}

}
