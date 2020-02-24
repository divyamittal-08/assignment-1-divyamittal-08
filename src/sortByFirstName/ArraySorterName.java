package sortByFirstName;
import java.util.Comparator;
import person.Person;

import java.util.Collections;

public class ArraySorterName implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.getFName().compareToIgnoreCase(p2.getFName());
    }
}
