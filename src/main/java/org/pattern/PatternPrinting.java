package org.pattern;

public class PatternPrinting {
    public static void main(String[] args) {
        System.out.println("Line ======>");
        printLine();
        System.out.println();

        System.out.println("Square ======>");
        printSquare();

        System.out.println("Staircase ======>");
        printRightStaircase();

        System.out.println("======>");

        printLeftStaircase();
        System.out.println("======>");

        printRightAngleLeftInv();
        System.out.println("======>");

        printRightAngleRightInv();
        System.out.println("======>");


    }

    private static void printRightAngleRightInv() {
    }

    private static void printRightAngleLeftInv() {
    }

    private static void printLeftStaircase() {
        for(int i = 0; i<9; i++){

        }
    }

    private static void printRightStaircase() {
        for (int j = 1; j<=4; j++){
            for(int i = 1; i<=2*j; i++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    private static void printLine() {
        for(int i = 1; i<=8; i++){
            System.out.print("*"+" ");
        }
    }

    private static void printSquare() {
        for (int j = 1; j<=4; j++){
            for(int i = 1; i<=8; i++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
