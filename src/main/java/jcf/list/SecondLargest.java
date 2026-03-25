package jcf.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Problem statement:
Given a list of integers, find the second-largest distinct element. If no such element exists, print an appropriate message.
Solve it without sorting (O(n)) and also with Collections.sort — compare both approaches.

Input:  [12, 35, 1, 10, 34, 1]
Output: Second largest = 34

 */
public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 35, 35, 1, 10, 34, 1); //Unmodifiable

//        List<Integer> numbers = new ArrayList<>(Arrays.asList(12, 35, 1, 10, 34, 1)); //The ArrayList Can be modified.

//        Integer max = findMax(numbers);
        Integer max = Integer.MIN_VALUE;

        Integer secondMax = Integer.MIN_VALUE;

        for(Integer num:numbers){
            if(num>max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && !num.equals(max)) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest");
        } else {
            System.out.println(secondMax);
        }
//        Second Method
        method(numbers);

    }

    public static void method(List<Integer> list) {

        list.sort(Collections.reverseOrder());

        if(list.size()<2){
            System.out.print("No second largest element");
        }

        Integer max = list.get(0);

        for (int i=0; i<list.size(); i++){
            if(!list.get(i).equals(max)){
                System.out.print(list.get(i));
                break;
            }
        }

    }
}
