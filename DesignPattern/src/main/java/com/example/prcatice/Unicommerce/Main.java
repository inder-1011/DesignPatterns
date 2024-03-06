package com.example.prcatice.Unicommerce;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        //1,2,5   1,7   2,6
        int[] arr = {10, 1, 2, 7, 6, 5};
        int n = arr.length;
        int targetSum = 8;

        findTargetSum(arr, n, targetSum);

        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>();

}

    private static void findTargetSum(int[] arr, int n, int targetSum) {
        Arrays.sort(arr);
        int start=0;
        int tempSum=0;
        int[] tempArray = new int[n];
        int j=0;
        for (int i=n-1;i>0;i--){
            tempSum= arr[i]+arr[start];
            if(tempSum==targetSum){
                tempSum =0 ;

            }
        }
    }
}
