package jcf.list;


/*The Scenario: You have a list of test execution results from a CI/CD pipeline.
Some tests passed, some failed with specific error codes, and some were skipped.
["PASS", "FAIL_404", "PASS", "SKIP", "FAIL_500", "PASS", "FAIL_404"]

The Task: Write a method that takes this List<String> and returns a Map<String, Integer> showing the count of each result.*/


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfTestResult {
    public static void main(String[] args) {
        List<String> testResultFromCI = Arrays.asList("PASS", "FAIL_404", "PASS", "SKIP", "FAIL_500", "PASS", "FAIL_404");

//      Without Using .getOrDefault(Object, V) method
        System.out.println(countErrorType1(testResultFromCI));

//        Using .getOrDefaultMethod.
        System.out.println(countErrorType2(testResultFromCI));

//        using Stream API
        System.out.println(countErrorType3(testResultFromCI));

    }

    private static Map<String, Long> countErrorType3(List<String> testResults) {
        return testResults.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private static Map<String, Integer> countErrorType2(List<String> testResultFromCI) {

        Map<String, Integer> count = new HashMap<>();

        for(String result : testResultFromCI){
            count.put(result, count.getOrDefault(result, 0)+1);
        }

        return count;
    }

    private static LinkedHashMap<String, Integer> countErrorType1(List<String> testResults) {

        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();

        for (String testResult : testResults) {
            if (hashMap.containsKey(testResult)) {
                hashMap.put(testResult, hashMap.get(testResult) + 1);
            } else {
                hashMap.put(testResult, 1);
            }
        }

        return hashMap;
    }

}
