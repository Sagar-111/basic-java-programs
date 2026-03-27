package jcf.set;

/*

Find duplicate elements in an array
HashSet add() returns false
easy
▴ PS
Problem statement
Given an integer array, find all duplicate elements.
Use the fact that HashSet.add() returns false if the element already exists.
Print each duplicate exactly once.
Input:  [1, 2, 3, 2, 4, 1, 5]
Output: Duplicates = [1, 2]
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 1, 5};

        Set<Integer> uniqueElements = new HashSet<>();

        List<Integer> duplicates = new ArrayList<>();

        for(int i: array){
            boolean added = uniqueElements.add(i);

            if(!added) duplicates.add(i);
        }

        System.out.print(duplicates);

    }

}
