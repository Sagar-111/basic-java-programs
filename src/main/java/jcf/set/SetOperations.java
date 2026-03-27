package jcf.set;

/*
Find union, intersection, difference of two sets
HashSet
easy
▴ PS
Problem statement
Given two integer arrays, convert them to HashSets and compute: (a) union, (b) intersection, (c) difference (elements in set1 not in set2). Print all three results.
Input:  A=[1,2,3,4], B=[3,4,5,6]
Union:        [1,2,3,4,5,6]
Intersection: [3,4]
Difference:   [1,2]
 */

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4};
        int[] B = {3, 4, 5, 6};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : A) set1.add(num);
        for (int num : B) set2.add(num);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference S1-S2: " + difference);
    }
}
