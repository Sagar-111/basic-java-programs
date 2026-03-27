package jcf.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BasicOperationDiff {
    public static void main(String[] args) {
        List<Integer> als = new ArrayList<>();

        List<Integer> lls = new LinkedList<>();

        for(int i=0; i<=10000; i++){
            als.add(i);
            lls.add(i);
        }

        long tInitAL = System.nanoTime();
        als.add(0, 10);
        long tFinalAL = System.nanoTime();

        long tInitLL = System.nanoTime();
        lls.add(0, 10);
        long tFinalLL = System.nanoTime();

        String formatted = String.format("Adding at Index; ArrayListTime: %s Ms | LinkedListTime: %s Ms",(tFinalAL-tInitAL)/1000, (tFinalLL-tInitLL)/1000);
        System.out.println(formatted);

        long tInitAL1 = System.nanoTime();
        als.remove(0);
        long tFinalAL1 = System.nanoTime();

        long tInitLL1 = System.nanoTime();
        lls.remove(0);
        long tFinalLL1 = System.nanoTime();

        String formatted1 = String.format("Removing at Index; ArrayListTime: %s Ms | LinkedListTime: %s Ms",(tFinalAL1-tInitAL1)/1000, (tFinalLL1-tInitLL1)/1000);
        System.out.println(formatted1);

        long tInitAL2 = System.nanoTime();
        als.get(10000);
        long tFinalAL2 = System.nanoTime();

        long tInitLL2 = System.nanoTime();
        lls.get(10000);
        long tFinalLL2 = System.nanoTime();

        String formatted2 = String.format("Getting at Index; ArrayListTime: %s Ms | LinkedListTime: %s Ms",(tFinalAL2-tInitAL2)/1000, (tFinalLL2-tInitLL2)/1000);
        System.out.println(formatted2);

    }
}
