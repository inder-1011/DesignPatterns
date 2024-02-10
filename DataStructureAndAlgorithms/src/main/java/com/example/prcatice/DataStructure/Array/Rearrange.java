package com.example.prcatice.DataStructure.Array;

import java.util.Arrays;

public class Rearrange {

    public static void main(String[] args) {
        int[] arr=  { 1, 2, 3, 4, 5, 6 };
        int[] result = rearrange(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] rearrange(int[] arr) {
        int[] temp = arr.clone();
        int start=0;
        int end = arr.length-1;
        boolean flag=true;
        for (int i=0;i<arr.length;i++){
            if(flag){
                arr[i]=temp[start];
                start++;
            }else {
                arr[i]=temp[end];
                end--;
                flag=!flag;
            }
        }


        return arr;
    }
}
