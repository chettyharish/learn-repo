//Program to implement Stack using Arrays

public class StackArray {

	int items[], i = 0;

	public StackArray(int N) {
		items = new int[N];
	}

	public void push(int value) {
		items[i++] = value;
	}

	public int pop() {
		return items[--i];
	}

	public boolean isEmpty() {
		return i == 0;
	}

	public static void main(String[] args) {
		StackArray obj = new StackArray(10);
		obj.push(10);
		obj.push(50);
		obj.push(40);
		obj.push(30);
		obj.push(20);

		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
	
	}
}
