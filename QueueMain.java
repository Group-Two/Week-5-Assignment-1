import java.util.Random;

public class QueueMain {
    public static void main(String[] args) {
    	Queue myQueue = new Queue();
    	// Generate random values
    	Random r = new Random();
    	// How many random entries to populate in the queue
    	int runs = 12;
    	
    	for(int i = 0; i < runs; i++) {
        	// Strings are created from Integers
    		myQueue.enqueue((new Integer(r.nextInt())).toString(), r.nextInt(10));
    	}

    	System.out.println("Printing Queue Contents... (Content, Priority)");
    	System.out.println(myQueue);
    	
    	System.out.println("Dequeueing...");
    	while(!myQueue.isEmpty()) {
    		System.out.println(myQueue.dequeue());
    	}
    }
}