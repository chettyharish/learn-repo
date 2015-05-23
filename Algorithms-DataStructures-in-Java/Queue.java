//Program to implement Queue

import java.util.Iterator;

class Queue<T> implements Iterable<T> {

	Node first, last;

	private class Node {
		T value;
		Node next;
	}

	public void enqueue(T value) {
		Node oldlast = last;
		last = new Node();
		last.value = value;
		if (isEmpty())
			first = last;
		else
			oldlast.next = last;
	}

	public T dequeue() {
		T value = first.value;
		first = first.next;
		if (isEmpty())
			last = null;

		return value;
	}

	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public Iterator<T> iterator() {

		return new ListIterator();
	}

	private class ListIterator implements Iterator<T> {
		Node current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

	}

}
