public class QueueNode<T> {
	private QueueNode<T> next, prev;
	private T obj;
	private int priority;

	public QueueNode(T obj, int priority) {
		next = null;
		prev = null;
		
		this.obj = obj;
		this.priority = priority;
	}
	
	/**
	 * @return the obj
	 */
	public T getObj() {
		return obj;
	}
	
	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}
	/**
	 * @return the prev
	 */
	public QueueNode<T> getPrev() {
		return prev;
	}

	/**
	 * @param prev the prev to set
	 */
	public void setPrev(QueueNode<T> prev) {
		this.prev = prev;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(QueueNode<T> next) {
		this.next = next;
	}
	/**
	 * @return the next
	 */
	public QueueNode<T> getNext() {
		return next;
	}
}
