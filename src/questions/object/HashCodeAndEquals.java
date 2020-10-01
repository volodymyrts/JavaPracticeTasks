package questions.object;

import java.util.HashMap;
import java.util.Map;

class Employee {
    int id;

    public Employee(int id) {
        this.id = id;
    }
}

public class HashCodeAndEquals {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee(1);

        Map<Employee, String> map = new HashMap<Employee, String>();
        map.put(emp1, "Employee");
        map.put(emp2, "Employee");

        System.out.println(map.size()); // What is the size of the map? Answer: 2
        // Duplicated elements were added to HashMap

        // -----------------------

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);

        Map<Integer, String> map2 = new HashMap<Integer, String>();

        map2.put(i1, "one");
        map2.put(i2, "one");

        System.out.println(map2.size()); // What is the size of the map? Answer: 1
    }
}
