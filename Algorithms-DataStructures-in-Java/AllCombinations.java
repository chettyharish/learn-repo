//Program to find All Combinations -> Dynamic Programming

public class AllCombinations {

	public static void main(String[] args) {
		AllCombinations obj = new AllCombinations();
		char arr[] = "ABCD".toCharArray();
		int a[] = new int[arr.length];
		obj.printCombinations(arr, a,0, a.length - 1);
	}

	private void printCombinations(char[] arr, int a[], int k, int N) {
		if (k == N) {
			a[k] = 0;
			printArray(arr, a);
			a[k] = 1;
			printArray(arr, a);
		} else {
			a[k] = 0;
			printCombinations(arr, a, k + 1, N);
			a[k] = 1;
			printCombinations(arr, a, k + 1, N);
		}

	}

	private void printArray(char[] arr, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1)
				System.out.print(arr[i] + "  ");
		}
		System.out.println();

	}
}
