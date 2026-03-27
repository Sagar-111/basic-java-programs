package jcf.map;

/*
Given a HashMap representing word frequencies, sort the map by value in descending order and store the result in a LinkedHashMap. Implement using both stream API and Comparator approach.

Input:  {apple=3, mango=5, banana=1}
Output: {mango=5, apple=3, banana=1}
 */

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("mango", 5);
        map.put("banana", 1);

        System.out.println(sortUsingComparator(map));
        System.out.println(sortUsingStream(map));
    }

    private static Map<String, Integer> sortUsingComparator(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        entries.sort((e1, e2) -> e2.getValue() - e1.getValue()); // descending

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    private static Map<String, Integer> sortUsingStream(Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue() - e1.getValue()) // descending
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,        // merge function — handles duplicate values
                        LinkedHashMap::new      // preserve sorted insertion order
                ));
    }
}
