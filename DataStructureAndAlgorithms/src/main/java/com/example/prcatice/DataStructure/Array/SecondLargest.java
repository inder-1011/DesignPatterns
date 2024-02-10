package com.example.prcatice.DataStructure.Array;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int secondLargest = secondLargest(arr);
        System.out.println(secondLargest);
    }

    private static int secondLargest(int[] arr) {
        int largest=0,secondLargest=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]!= largest){
                secondLargest = arr[i];
            }
        }



        return secondLargest;
    }
}
