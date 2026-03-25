package jcf.list;

import jcf.util.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/*
Scenario: You are automating a HR portal. You have a List<Employee> and you need to verify they are sorted correctly on the UI.
Each Employee object has: String name, int id, and double salary.
*/

public class EmployeeSorting {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Alice", "1", 75000),
                new Employee("Bob", "2", 85000),
                new Employee("Charlie", "3", 75000),
                new Employee("Chaplin", "5", 75000),
                new Employee("David", "4", 90000)
        ));

        employees.sort(Comparator
                .comparingDouble((Employee e) -> e.salary).reversed()
                .thenComparing((Employee e) -> e.name));

        employees.forEach(System.out::println);
    }
}
