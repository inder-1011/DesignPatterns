package com.example.prcatice.Test;

import java.util.Arrays;

public class StatusNeo {
    public static int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
           currentSum += nums[i];

           if(currentSum>maxSum){
               maxSum= currentSum;
           }
           if(currentSum<0){
               currentSum=0;
           }
        }
        return maxSum;
    }

    public static int maxProfit(int[] prices) {
        int profit=0;
        int max =0;
        int secondMax =0;
        for (int i=1;i<prices.length;i++){
            if(prices[i-1]<prices[i]){
                 profit =  profit+(prices[i]-prices[i-1]);
                if(profit>secondMax){
                    secondMax =profit;
                }if(secondMax>max){
                    int temp=0;
                    temp= secondMax;
                    secondMax= max;
                    max=temp;

                }
            }else{
                profit=0;
            }
        }

        return secondMax+max;
    }

    public static String mergeAlternately(String word1, String word2) {
       StringBuilder result = new StringBuilder();
       int i=0;
       while (i<word1.length() || i<word2.length()){
           if(i<word1.length()){
               result.append(word1.charAt(i));
           }
           if(i<word2.length()){
               result.append(word2.charAt(i));
           }
           i++;
       }
       return result.toString();

    }

    public static int[] productExceptSelf(int[] nums) {
    int n= nums.length;
     int result[] = new int[n];
     result[0]=1;
     for (int i=1;i<n;i++){
         result[i]= nums[i]*result[i-1];
     }
     int sum =1;
     for (int i=n-1;i>0;i++){
         result[i]=result[i]*sum;
         sum *= nums[i];
     }
     return result;

    }

    public static void main(String[] args) {
    String s= "null";
    String s2= null;
    String s3 = "null";
    if(s.equals(s3)){
        System.out.println("true");
    }else {
        System.out.println("false");
    }
    }
}
