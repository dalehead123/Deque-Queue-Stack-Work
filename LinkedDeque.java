import java.util.NoSuchElementException;

// Proj 4 pt 1
// Dale Savage

public class LinkedDeque<T> implements DequeInterface<T> {
	private Node<T> firstNode;

	public LinkedDeque() {
		firstNode = null;
	}

	@Override
	public void addToFront(T item) {

		// edge cases to consider
		// what if dequeue is empty
		// what if the dequeue has exactly one node
		Node<T> temp = new Node<>(item);
		// handle the empty dequeue situation
		if (firstNode == null) {
			firstNode = temp;
			firstNode.next = firstNode;
			firstNode.previous = firstNode;
		} else {
			temp.previous = firstNode.previous;
			temp.next = firstNode;
			firstNode.previous.next = temp;
			firstNode.previous = temp;
			firstNode = temp;
		}

	}

	@Override
	public void addToBack(T item) {
		// edge cases to consider
		// what if dequeue is empty
		// what if the dequeue has exactly one node
		Node<T> temp = new Node<>(item);
		// handle the empty dequeue situation
		if (firstNode == null) {
			firstNode = temp;
			firstNode.next = firstNode;
			firstNode.previous = firstNode;
		} else {
			temp.previous = firstNode.previous;
			temp.next = firstNode;
			firstNode.previous.next = temp;
			firstNode.previous = temp;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T removeFront() {
		Object result = null;

		if (isEmpty()) {
			throw new NoSuchElementException("Deque is empty!");
		} else if (firstNode.equals(firstNode.previous) && firstNode.equals(firstNode.next)) {
			result = firstNode.data;
			firstNode = firstNode.previous = firstNode.next = null;
		} else {
			result = firstNode.data;
			firstNode.next.previous = firstNode.previous;
			firstNode.previous.next = firstNode.next;
			firstNode = firstNode.next;
		}

		return (T) result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T removeBack() {
		Object result = null;
		if (isEmpty()) {
			throw new NoSuchElementException("Deque is empty!");
		} else if (firstNode.equals(firstNode.previous) && firstNode.equals(firstNode.next)) {
			result = firstNode.data;
			firstNode = firstNode.previous = firstNode.next = null;
		} else {
			result = firstNode.previous.data;
			firstNode.previous = firstNode.previous.previous;
			firstNode.previous.next = firstNode;
		}

		return (T) result;
	}

	@Override
	public T getFront() {
		if (isEmpty()) {
			throw new NoSuchElementException("Deque is empty!");
		}

		return firstNode.data;
	}

	@Override
	public T getBack() {
		if (isEmpty()) {
			throw new NoSuchElementException("Deque is empty!");
		}
		return firstNode.previous.data;
	}

	@Override
	public boolean isEmpty() {
		return firstNode == null;
	}

	@Override
	public void clear() {
//		while (!(firstNode == null)) {
//			removeFront();
//		}

		firstNode = null;

	}

	@Override
	public String toString() {
		String result = "FRONT-TO-BACK: [";

		Node<T> curr = firstNode;
		while (!isEmpty()) {

			result += curr.data + " ";
			curr = curr.next;
			if (firstNode == curr) {
				break;
			}
		}

		result += "], ";

		result += "BACK-TO-FRONT: [";
		if (firstNode != null) {
			curr = firstNode.previous;
		}
		while (!isEmpty()) {

			result += curr.data + " ";
			curr = curr.previous;
			if (firstNode.previous == curr) {
				break;
			}
		}

		result += "]";

		return result;
	}

	private class Node<E> {
		private E data;
		private Node<E> next;
		private Node<E> previous;

		private Node(E data) {
			this.data = data;
			this.next = null;
			this.previous = null;
		}
	}

}
