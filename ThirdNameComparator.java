package fmi.informatics.comparators;
import fmi.informatics.extending.Person;

public class ThirdNameComparator extends PersonComparator{
	
	@Override
	public int compare(Person person1, Person person2) {
		if (person1.getThirdName().equals(person2.getThirdName())) {
			return 0;
		} else {
			return (person1.getThirdName().compareTo(person2.getThirdName()) * sortOrder);
		}
	}

}
