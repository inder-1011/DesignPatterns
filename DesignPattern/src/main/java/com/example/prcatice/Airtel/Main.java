package com.example.prcatice.Airtel;

import java.util.HashMap;

public class Main {



    public static void main(String[] args) {
        String[] stringArray = {"aaa", "bbb", "ccc", "bbb",
                "aaa", "aaa"};


        HashMap<String,Integer> hashCount = new HashMap<>();
        for (int i=0;i<stringArray.length;i++){
            if(hashCount.containsKey(stringArray[i])){
                int count = hashCount.get(stringArray[i]);
                hashCount.put(stringArray[i],count+1);
            }
        }
    }
}
