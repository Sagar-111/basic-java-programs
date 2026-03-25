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

//      To find time for addition in LinkedList and ArraysList
//        long tInitAL = System.nanoTime();
//        als.add(1000, 10);
//        long tFinalAL = System.nanoTime();
//
//        long tInitLL = System.nanoTime();
//        lls.add(1001, 10);
//        long tFinalLL = System.nanoTime();
//
//        String formatted = String.format("Adding at Index; ArrayListTime: %s Ms | LinkedListTime: %s Ms",(tFinalAL-tInitAL)/1000, (tFinalLL-tInitLL)/1000);
//      At Index = 0  ==> ArrayListTime: 67.100 Ms | LinkedListTime: 8.400 Ms
//      At Index = 500  ==> ArrayListTime: 56 Ms | LinkedListTime: 15 Ms
//      At Index = 1001  ==>  ArrayListTime: 72 Ms | LinkedListTime: 21 Ms
//      At Index = 1000  ==> ArrayListTime: 57 Ms | LinkedListTime: 20 Ms


//      To find time for Removal from LinkedList and ArraysList
//        long tInitAL1 = System.nanoTime();
//        als.remove(0);
//        long tFinalAL1 = System.nanoTime();
//
//        long tInitLL1 = System.nanoTime();
//        lls.remove(0);
//        long tFinalLL1 = System.nanoTime();
//
//        String formatted = String.format("Removing at Index; ArrayListTime: %s Ms | LinkedListTime: %s Ms",(tFinalAL1-tInitAL1)/1000, (tFinalLL1-tInitLL1)/1000);
//      At Index = 0  ==> Removing at Index; ArrayListTime: 11 Ms | LinkedListTime: 7 Ms
//      At Index = 500  ==> Removing at Index; ArrayListTime: 13 Ms | LinkedListTime: 15 Ms
//      At Index = 1000  ==> Removing at Index; ArrayListTime: 14 Ms | LinkedListTime: 28 Ms

//      To find time for addition in LinkedList and ArraysList
        long tInitAL2 = System.nanoTime();
        als.get(10000);
        long tFinalAL2 = System.nanoTime();

        long tInitLL2 = System.nanoTime();
        lls.get(10000);
        long tFinalLL2 = System.nanoTime();

        String formatted = String.format("Getting at Index; ArrayListTime: %s Ms | LinkedListTime: %s Ms",(tFinalAL2-tInitAL2)/1000, (tFinalLL2-tInitLL2)/1000);
//      At Index = 0  ==> Getting at Index; ArrayListTime: 4 Ms | LinkedListTime: 7 Ms
//      At Index = 500  ==> Getting at Index; ArrayListTime: 6 Ms | LinkedListTime: 14 Ms
//      At Index = 1000  ==> Getting at Index; ArrayListTime: 12 Ms | LinkedListTime: 34 Ms
//      At Index = 10000  ==> Getting at Index; ArrayListTime: 8 Ms | LinkedListTime: 9 Ms

        System.out.println(formatted);

    }
}
