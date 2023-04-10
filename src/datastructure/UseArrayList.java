package datastructure;


		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();


		numbers.add(10);
		numbers.add(20);
		numbers.add(30);


		int firstNumber = numbers.get(0);
		System.out.println("First number: " + firstNumber);


		numbers.remove(1);


		System.out.println("Elements using For Each loop:");
		for (int number : numbers) {
			System.out.println(number);
		}


		System.out.println("Elements using Iterator:");
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}


		Collections.sort(numbers);


	}

}
