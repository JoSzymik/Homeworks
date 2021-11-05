/* -----------------------------------------------
  	 Submitted By: Joanna Szymik
 ------------------------------------------------ */

import java.util.*;

public class Task_two {
	public static void main(String[] args) {

		String text = "Another one bites the dust";

		TreeSet<String> my_set = new TreeSet<String>();
		String[] words = text.split("[ \n\t\r.,;:!?(){}]");
		for (int i = 0; i < words.length; i++) {
			String value = words[i].toLowerCase();
			if (words[i].length() > 0)
				my_set.add(value);
		}
		for (Object element: my_set)
			System.out.println(element.toString() + " ");
	}
}
