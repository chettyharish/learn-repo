//Program to implement Stack

import java.util.Iterator;

public class StackGeneric<Gentype> implements Iterable<Gentype> {
	private Node first = null;

	private class Node {
		Gentype value;
		Node next;
	}

	public Gentype peek() {
		if (first==null){
			return null;
		}
		return first.value;
	}

	public void push(Gentype value) {
		Node oldfirst = first;
		first = new Node();
		first.value = value;
		first.next = oldfirst;
	}

	public Gentype pop() {
		Gentype value = first.value;
		first = first.next;
		return value;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public static void main(String[] args) {
		StackGeneric<Integer> obj = new StackGeneric<>();

		obj.push(10);

		System.out.println(obj.pop());
	}

	@Override
	public Iterator<Gentype> iterator() {
		return new ListIterator();
	}

	private class ListIterator implements Iterator<Gentype> {
		Node current = first;

		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Gentype next() {
			Gentype value = current.value;
			current = current.next;
			return value;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}
	}

}
