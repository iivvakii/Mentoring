package task3;

import java.util.Comparator;

public class MyDateComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getBirthdayDate().compareTo(o2.getBirthdayDate());

    }
}
