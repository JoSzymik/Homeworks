/* -----------------------------------------------
  	 Submitted By: Joanna Szymik
 ------------------------------------------------ */
import java.util.*;

public class Task_one {
	public static void main(String[] args) {

		// Create two linked hash sets
		Set<String> set_one = new LinkedHashSet<>(Arrays.asList(
			"George", "Jim", "John", "Blake", "Kevin", "Michael"));
		Set<String> set_two = new LinkedHashSet<>(Arrays.asList(
			"George", "Katie", "Kevin", "Michelle", "Ryan"));

		// Display the union of the two sets
		Set<String> union = new LinkedHashSet<>(set_one);
		union.addAll(set_two);
		System.out.println("Union of the two sets: " + union);

		// Display the difference of the two sets
		Set<String> difference = new LinkedHashSet<>(set_one);
		difference.removeAll(set_two);
		System.out.println("Difference of the two sets: " + difference);


		// Display the intersection of the two sets
		Set<String> intersection = new LinkedHashSet<>();
		for (String e: set_two) {
			if (set1.contains(e))
				intersection.add(e);
		}
		System.out.println("Intersection of the two sets: " + intersection);
	}
}
