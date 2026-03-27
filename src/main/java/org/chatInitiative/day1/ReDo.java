package org.chatInitiative.day1;

public class ReDo {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 4, -8, 0, 4, 8, -2, 3, 9};

        int sum = maxSubArraySum(arr);

        System.out.print(sum);

    }

    private static int maxSubArraySum(int[] arr) {
        int maxSum = arr[0];

        int currentSum = arr[0];

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for(int i = 0; i<arr.length; i++){
            if (currentSum<0){
                currentSum=0;
                tempStart = i;
            } else {
                currentSum += arr[i];
            }

            if (maxSum<currentSum){
                maxSum = currentSum;
                start =tempStart;
                end = i;
            }
        }
        for(int i =start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }

        return maxSum;
    }
}
