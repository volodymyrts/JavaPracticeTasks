package questions.object;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee {
    int id;

    public Employee(int id) {
        this.id = id;
    }

    // ----------------------------------
    // Added equals and hashcode methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class HashCodeAndEquals {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee(1);

        Map<Employee, String> map = new HashMap<Employee, String>();
        map.put(emp1, "Employee");
        map.put(emp2, "Employee"); // Duplicated elements were added to HashMap

        System.out.println(map.size()); // What is the size of the map?
                                        // Answer: 2 (when Employee class has no equals and hashcode methods)

        System.out.println(map.entrySet());

        // ------------------------------

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);

        Map<Integer, String> map2 = new HashMap<Integer, String>();

        map2.put(i1, "one");
        map2.put(i2, "one");

        System.out.println(map2.size()); // What is the size of the map? Answer: 1
    }
}
