package fmi.informatics.comparators;
import fmi.informatics.extending.Person;


public class SecondNameComparator extends PersonComparator {

	@Override
	public int compare(Person person1, Person person2) {
		if (person1.getSecondName().equals(person2.getSecondName())) {
			return 0;
		} else {
			return (person1.getSecondName().compareTo(person2.getSecondName()) * sortOrder);
		}
	}
}
