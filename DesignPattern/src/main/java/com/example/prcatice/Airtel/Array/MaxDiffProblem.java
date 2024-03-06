package com.example.prcatice.Airtel.Array;

public class MaxDiffProblem {


    public static void main(String[] args) {
        int []arr = {7, 9, 5, 6, 3, 2};
        int result = maxDiffArray(arr,arr.length);
        System.out.println(result);
    }

    private static int maxDiffArray(int[] arr, int n) {
        int maxDiff = Integer.MIN_VALUE;
        int min = arr[0];
        for (int i=1;i<n;i++){
            int diff = arr[i]-min;
            if(diff>maxDiff){
                maxDiff= diff;
            }
            if(arr[i]<min){
                min = arr[i];
            }

        }
        return maxDiff;

    }
}
