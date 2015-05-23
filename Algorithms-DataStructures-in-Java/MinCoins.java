//Program to find Minimum number of coins - > Dynamic Programming

public class MinCoins {

	private int minCoins(int a[], int value) {
		int min = 32767;
		if (value <= 0)
			return 0;

		for (int i = 0; i < a.length; i++) {
			int current_min_val = minCoins(a, value - a[i]);
			if (current_min_val < min) {
				min = current_min_val;
			}
		}
		return min + 1;
	}

	public static void main(String[] args) {
		int coinvals[] = { 1, 2, 3, 5 };
		MinCoins obj = new MinCoins();
		System.out.println(obj.minCoins(coinvals, 10));
	}
}
