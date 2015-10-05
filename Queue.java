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

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
}