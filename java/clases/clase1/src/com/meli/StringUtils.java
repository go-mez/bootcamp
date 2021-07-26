package com.meli;


import java.util.Arrays;

public class StringUtils {
    public static String replicate(char c, int n) {
        String str = "";
        for(int i = 0; i < n; i++) str+=c;

        return str;
    }

    public static String lpad(String s, int n, char c) {
        String predecesor = "";
        for(int i = 0; i < n - s.length(); i++) predecesor+=c;

        return predecesor+s;
    }

    public static String[] toStringArray(int arr[]) {
        String[] strArray = new String[arr.length];
        for(int i = 0; i < arr.length; i++) strArray[i] = String.valueOf(arr[i]);

        return strArray;
    }

    public static int[] toIntArray(String arr[]) {
        int[] intArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++) intArray[i] = Integer.parseInt(arr[i]);

        return intArray;
    }

    public static int maxLength(String arr[]) {
        int max = -500;
        for(int i = 0; i < arr.length; i++){
            if( arr[i].length() > max) max = arr[i].length();
        }

        return max;
    }

    public static void lNormalize(String arr[], char c) {
        int maxLength = maxLength(arr);
        for(int i = 0; i < arr.length; i++) {
            if( maxLength - arr[i].length() > 0) arr[i] = lpad(arr[i], maxLength, c);
        }

    }

    public static void main(String[] args) {
        // System.out.println(replicate('T',5));
        System.out.println("test: "+lpad("111", 1, '0'));
        // System.out.println(lpad("xxx", 6, 'T'));
        // System.out.println(Arrays.toString(toStringArray(new int[]{1,2,3,4})));
        // System.out.println(Arrays.toString(toIntArray(new String[]{"111","33","5550","001"})));
        // System.out.println(maxLength(new String[]{"111","33","5550","1","50505055"}));
        String[] arr = new String[]{"111","33","5550","1","1250","3"};
        System.out.println(Arrays.toString(arr));
        lNormalize(arr, '0');
        System.out.println(Arrays.toString(arr));
    }
}
