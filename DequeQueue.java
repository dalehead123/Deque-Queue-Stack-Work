// Proj 4 pt 3
// Dale Savage
public class DequeQueue<T> implements QueueInterface<T> {
	private LinkedDeque<T> queue;
	
	public DequeQueue() {
		queue = null;
	}

	@Override
	public void add(T newEntry) {
		queue.addToBack(newEntry);
	}

	@Override
	public T remove() {
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
