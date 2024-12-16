// Proj 4 pt 2
// Dale Savage
public class DequeStack<T> implements StackInterface<T> {
	private LinkedDeque<T> queue;

	public DequeStack() {
		queue = null;
	}

	@Override public void push(T item) {
		queue.addToFront(item);
	}

	@Override
	public T pop() {
		return queue.removeFront();
	}

	@Override
	public T peek() {
		return queue.getFront();
	}

	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	@Override
	public void clear() {
		queue.clear();
	}
}
