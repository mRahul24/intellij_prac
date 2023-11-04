package oct31.customlistexample;

import java.util.ArrayList;
import java.util.List;

public class CustomizedList {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Rahul", 22,"India"));
        list.add(new Employee("Madan", 21,"Canada"));
        list.add(new Employee("First", 28,"Mexico"));
        list.add(new Employee("Last", 4,"US"));
        System.out.println(list);

    }
}

