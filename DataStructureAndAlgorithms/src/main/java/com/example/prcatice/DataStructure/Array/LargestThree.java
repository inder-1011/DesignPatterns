package com.example.prcatice.DataStructure.Array;

import java.sql.Array;

public class LargestThree {


    public static void main(String[] args) {
        int[] arr = {1,2,34,5,6};
        int[] res = largestThree(arr);
        System.out.println(res[0]+" "+res[1]+ " " +res[2]);

    }

    private static int[] largestThree(int[] arr) {
       int first = 0,second=0,third =0;
       int[] res = new int[3];
       for (int i=0;i<arr.length;i++){
           if(arr[i]>first){
               third=second;
               second =first;
               first = arr[i];
           }else if(arr[i]>second && arr[i] != first){
               third = second;
               second = arr[i];
           }else if(arr[i]>third && arr[i] != second){
               third = arr[i];
           }
       }
       res[0]=first;
       res[1]=second;
       res[2]=third;
       return res;
    }
}
