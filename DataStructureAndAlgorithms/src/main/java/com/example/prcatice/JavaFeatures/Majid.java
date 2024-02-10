package com.example.prcatice.JavaFeatures;

import java.util.Locale;

public class Majid {


    public static String capitalizeString(String str){
        if(str.length()<=2){
            return str.toLowerCase(Locale.ROOT);
        }
        return str.substring(0,1).toUpperCase(Locale.ROOT)+ str.substring(1).toLowerCase(Locale.ROOT);
    }
    public static void main(String[] args) {
        String str = " capiTalIze tH titLe.";
        String[] strings = str.split("\\s");
        StringBuilder result = new StringBuilder();
        for (String s : strings){
            result.append(capitalizeString(s));
            result.append(" ");
        }
        System.out.println(result);
    }
}
