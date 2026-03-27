package jcf.set;

/*
Problem statement Given an unsorted array with duplicates, store all unique elements in a TreeSet and print them in ascending order.
Also demonstrate a custom comparator with TreeSet using a Student class sorted by age.
Input: [5, 1, 4, 2, 5, 3, 1]
Output: [1, 2, 3, 4, 5] What is tree set
 */

import jcf.util.Student;

import java.util.Set;
import java.util.TreeSet;

public class SortNoDuplicates {
    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 5, 3, 1};

        System.out.println(sortWithNoDuplicates(arr));

        System.out.println(customSortUsingComparator(arr));

    }

    private static Set<Student> customSortUsingComparator(int[] arr) {
        Set<Student> students = new TreeSet<>((s1, s2)->s1.age - s2.age);

        students.add(new Student("Ajay", 25));
        students.add(new Student("Bhagwan", 22));
        students.add(new Student("Chaitanya", 30));

        return students;
    }

    private static Set<Integer> sortWithNoDuplicates(int[] arr) {
        Set<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
        }
        return set;
    }
}
