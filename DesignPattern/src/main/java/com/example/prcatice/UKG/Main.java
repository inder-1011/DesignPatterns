package com.example.prcatice.UKG;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
       // String[] arr = {""};
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11};
        int len = arr.length;
        int groupSize=4;
       // Arrays.stream(arr).filter(n->n.contains("A")).collect(Collectors.toList())
        int [] result=sortArrayGroupWise(arr,len, groupSize);

        System.out.print(Arrays.toString(result));

    }

    private static int[] sortArrayGroupWise(int[] arr, int len, int groupSize) {

       // int reversedSofar=0;
        int start= 0;
        int end = groupSize-1;
        while (len>end){
            if(end<len) {
                reverseArray(arr, start, end);
                start = end + 1;
                int size = (end + groupSize);
                if(size<len){
                    end=size;
                }else {
                    end=len-1;
                    reverseArray(arr, start, end);
                    break;
                }
            }
        }


        return arr;

    }

    private static void reverseArray(int[] arr, int start, int end) {

        while (start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }

    // length arr
    // reversed so far
    // arr, start, end

    // while start<end // swap ==

}

// Employee name department
// department id greater than 5 employees

//  (select departmentId ,count(*) as count  from employee group by departmnetId Having count >5)


