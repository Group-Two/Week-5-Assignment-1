public abstract class AbstractQueue<T> {
	protected QueueNode<T> head;
	protected int size;
	
	public AbstractQueue() {
		head = null;
	}
	
	/**
	 * Searches the entire queue for the first highest priority node and returns it.
	 * If there is a tie in priority, this function returns the oldest one.
	 */
    public T dequeue() {
    	/* Assignment asks for dequeue to be Order N */
    	
    	QueueNode<T> cursor = head;

    	int highestPriorityFound = Integer.MIN_VALUE;
    	QueueNode<T> highestPriorityNode = null;
    	
    	if (isEmpty()) {
    		return null;
    	}
    	
    	while (cursor != null) {
    		if (cursor.getPriority() >= highestPriorityFound) {
    			highestPriorityFound = cursor.getPriority();
    			highestPriorityNode = cursor;
    		}
    		cursor = cursor.getNext();
    	}
    	
    	// remove the found node from the doubly linked list
    	// check if we are not the tail
    	if (highestPriorityNode.getNext() != null) {
    		highestPriorityNode.getNext().setPrev(highestPriorityNode.getPrev());
    	}
    	// check if we are not the head
    	if (highestPriorityNode.getPrev() != null) {
    		highestPriorityNode.getPrev().setNext(highestPriorityNode.getNext());

    	}
    	// we are the head
    	else {
    		head = highestPriorityNode.getNext();
    		
    		/*// Shouldn't be necessary
    		// check if the new head exists, since we could have an empty list now
    		if (head != null)
    			head.setPrev(null);*/
    	}
    	size--;
    	return highestPriorityNode.getObj();
    }
    
    public void enqueue(T obj, int priority) {
    	/* Assignment asks for enqueue to not reorder the list;
    	 * so let's add in front. */
    	QueueNode<T> newNode = new QueueNode<T>(obj, priority);
    	if (head != null) {
    		newNode.setNext(head);
    		head.setPrev(newNode);
    		head = newNode;
    	} else {
    		head = newNode;
    	}
    	size++;
    }
    public boolean isEmpty() {
    	return head == null;
    }
}
