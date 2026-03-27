package jcf.list;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* You are given a large log file containing thousands of transaction IDs. Some are duplicates.
You need to return a list of all unique IDs, maintaining the order in which they first appeared.*/

public class UniqueTransactions {
    public static void main(String[] args) {
        List<Integer> transactionIds = Arrays.asList(253532, 35353, 235353, 352353, 23532, 2353335, 235325, 235332, 23523523, 23532);

        System.out.print(listUniqueIds(transactionIds));
    }

    private static <T> Set<T> listUniqueIds(List<T> rawList){
        return new LinkedHashSet<>(rawList);
    }


}
