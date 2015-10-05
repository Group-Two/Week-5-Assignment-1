public class Queue extends AbstractQueue<String> {
	
	/**
	 * For debugging.  Prints the contents of this String Queue.
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		QueueNode<String> cursor = head;
    	
    	while (cursor != null) {
    		sb.append('(');
    		sb.append(cursor.getObj());
    		sb.append(", ");
    		sb.append(cursor.getPriority());
    		sb.append(")\n");
    		cursor = cursor.getNext();
    	}
    	
    	return sb.toString();
	}
}