package intro.comparator;

import java.util.Comparator;

public class CompareTwoObjects {
    public static void main(String[] args) {

        Comparator<Person> comparator = (p1, p2) -> p1.getName().compareTo(p2.getName());

        Person p1 = new Person(20, "Paul");
        Person p2 = new Person(22, "Alice");

        System.out.println(comparator.compare(p1, p2) > 0); //true

    }
}
