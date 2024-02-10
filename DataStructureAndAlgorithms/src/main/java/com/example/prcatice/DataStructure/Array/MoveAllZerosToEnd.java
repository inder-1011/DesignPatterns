package com.example.prcatice.DataStructure.Array;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZerosToEndNonOptimised(arr);
        moveZerosWithoutExtraSpace(arr);
    }

    private static void moveZerosWithoutExtraSpace(int[] arr) {
        int n= arr.length;
        int j = 0;
        for (int i=0;i<n;i++){
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }

    private static void moveZerosToEndNonOptimised(int[] arr) {
        int[] temp= new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(temp[i]);
        }

    }
}
