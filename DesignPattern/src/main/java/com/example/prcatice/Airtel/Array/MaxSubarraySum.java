package com.example.prcatice.Airtel.Array;

public class MaxSubarraySum {

    public static void main(String[] args) {
        int[] a = { 8 ,-8, 9, -9, 10, -11, 12};
        int n= a.length;

        int max = minAdjDiff(a,n);
        System.out.println(max);
    }

    private static int maxSumSubArray(int[] a, int n) {
        int maxSoFar = Integer.MAX_VALUE;
        int sumSoFar =0;

        for (int i=0;i<n;i++){
            sumSoFar = sumSoFar+a[i];
            if(maxSoFar<sumSoFar){
                maxSoFar = sumSoFar;
            }
            if(sumSoFar<0){
                sumSoFar=0;
            }
        }
        return maxSoFar;
    }

    public static int minAdjDiff(int arr[], int n) {

        int mindiff=Integer.MAX_VALUE;
        int firstElement= arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]= Math.abs(arr[i]-arr[i+1]);
            if(mindiff>arr[i]){
                mindiff=arr[i];
            }
        }
        arr[n-1]=Math.abs(arr[n-1]-firstElement);
        if(mindiff>arr[n-1]){
            mindiff=arr[n-1];
        }

        // Your code here
        return mindiff;

    }
}
