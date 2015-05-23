//Program to implement Resizing Stack

import java.util.Random;

public class ResizingArray {

	int items[], N = 1;

	public ResizingArray() {
		items = new int[N];
	}

	public int pop() {
		if (N == items.length / 4) {
			resize(items.length / 2);
			System.out.println("Array size reduced to " + items.length / 2);
		}

		return items[--N];
	}

	public void push(int n) {
		if (N == items.length) {
			resize(items.length * 2);
			System.out.println("Array size increased to " + items.length * 2);
		}
		items[N++] = n;

	}

	public void resize(int size) {
		int temp[] = new int[size];

		for (int i = 0; i < N; i++) {
			temp[i] = items[i];
		}

		items = temp;

	}

	public static void main(String[] args) {
		ResizingArray obj = new ResizingArray();
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			obj.push(r.nextInt(200));

		}

		for (int i = 0; i < 100; i++) {
		obj.pop() ;

		}
	}

}
