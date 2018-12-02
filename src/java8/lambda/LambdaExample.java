package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Vikram", "Malik", 35),
				new Person("Amit", "Sharma", 38), new Person("Nitin", "Gupta",
						36), new Person("Vikas", "Kumar", 32));

		// sort List by last Name
		System.out.println("Java7 : Sort by last name ");
		Collections.sort(list, new Comparator<Person>() {

			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		printAll(list);
		
		System.out.println("Java8 : Sort by fist name ");
		Collections.sort(list,
				(o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));

		// create a method that prints all elements in list
		printConditionlly(list,p->true);
		

		// print all people that have last name start with S
		System.out.println("Java7 : Print with S ");
		printConditionlly(list, new Condition() {

			public boolean test(Person p) {

				return p.getLastName().startsWith("S");
			}
		});
		System.out.println("Java8 : Print with S ");
		printConditionlly(list, p -> p.getLastName().startsWith("S"));

	}

	private static void printConditionlly(List<Person> list,
			Condition condition) {
		for (Person p : list) {
			if (condition.test(p)) {
				System.out.println(p.toString());
			}
		}

	}

	private static void printAll(List<Person> list) {
		for (Person p : list) {
			System.out.println(p.toString());
		}

	}

}

interface Condition {
	boolean test(Person p);
}
