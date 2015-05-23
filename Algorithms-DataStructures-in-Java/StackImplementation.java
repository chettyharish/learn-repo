//Program to implement Stack

class Stack {

	private Node first = null;

	private class Node {
		int value;
		Node next;
	}
	
	

	public boolean isEmpty() {
		return first == null;
	}

	public int pop() {
		if (!isEmpty()) {
			int value = first.value;
			first = first.next;
			return value;
		} else {
			System.out.println("No element to pop");
			return 0;
		}
	}

	public void push(int N) {
		Node oldfirst = first;
		first = new Node();
		first.value = N;
		first.next = oldfirst;
	}
}

public class StackImplementation {

	public static void main(String[] args) {
		Stack obj = new Stack();
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
		System.out.println(obj.pop());
		System.out.println(obj.pop());
	}

}
