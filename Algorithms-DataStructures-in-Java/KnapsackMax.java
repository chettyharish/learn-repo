//Program to find Knapsack Problem - > Dynamic Programming

public class KnapsackMax {

	public int findmax(int weight[], int benefit[], int capacity) {
		if (capacity == 0)
			return 0;

		int max = 0, current_max = 0;

		for (int i = 0; i < benefit.length; i++) {
			if (!(capacity - weight[i] < 0)) {
				current_max = findmax(weight, benefit, capacity - weight[i])
						+ benefit[i];
			}
			if (current_max > max)
				max = current_max;
		}

		return max;

	}

	public static void main(String[] args) {

		int weight[] = { 2, 3, 4, 5 };
		int benefit[] = { 3, 4, 5, 6 };

		KnapsackMax knapsackMax = new KnapsackMax();

		System.out.println(knapsackMax.findmax(weight, benefit, 5));

	}

}
