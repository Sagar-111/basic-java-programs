package prcts;

import java.util.Scanner;

public class Prctc14 {
        public static void main(String[] args) {
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output
            Scanner sc = new Scanner(System.in);

            int testCases = sc.nextInt();

            for(int i = 1; i<=testCases; i++){
                int num = sc.nextInt();

                int count=0;

                while(num>0){
                    num=num/10;
                    count++;
                }
                System.out.println(count);
                count=1;
            }

        }
    }
    
