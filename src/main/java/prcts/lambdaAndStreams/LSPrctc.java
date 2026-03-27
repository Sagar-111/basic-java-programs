package prcts.lambdaAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LSPrctc {

    public static void main(String[] args) {

//        List<Integer> numbers =new ArrayList<>(Arrays.asList(3,8,15,6,20));

        List<Integer> numbers = Arrays.asList(3,8,15,6,20);


        numbers.stream()
                .filter(x->x>8)
                .map(x->x*2)
                .forEach(System.out::println);

    }

}
