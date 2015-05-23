package DataStructures;

public class MinMax {
	public static void main(String[] args) {
		int numberarray[] = { 5, 6, 8, 1, 3, 5, 4, 6, 9, 4, 2, 3, 4, 7, 9, 6 };
		int min, max;
		min = max = numberarray[0];

		for (int i = 0; i < numberarray.length; i++) {
			if (numberarray[i] < min)
				min = numberarray[i];
			if (numberarray[i] > max)
				max = numberarray[i];
		}		
		System.out.println("The pair farthest apart is ( "+max+" , "+min+" )");
	}
}
