package datastructure;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> queue = new LinkedList<>();


		queue.add("apple");
		queue.add("banana");
		queue.add("cherry");


		System.out.println("Peeked element: " + queue.peek());


		System.out.println("Removed element: " + queue.remove());


		System.out.println("Polled element: " + queue.poll());


		System.out.println("Queue elements (for-each loop):");
		for (String fruit : queue) {
			System.out.println(fruit);
		}


		System.out.println("Queue elements (while loop with iterator):");
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}