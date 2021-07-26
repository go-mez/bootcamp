package com.meli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {
    public static List<String> flattenList(List<List<String>> list) {
        List<String> flattenedList = new ArrayList<>();
        list.forEach(flattenedList::addAll);
        return flattenedList;
    }

    public static void radixSort(int[] arr) {
        String[] strArr = StringUtils.toStringArray(arr);
        int maxLength = StringUtils.maxLength(strArr);
        StringUtils.lNormalize(strArr, '0');
        List<String> stringList = Arrays.asList(strArr);
        System.out.println(stringList);


        List<List<String>> listas = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            listas.add(new ArrayList<>());
        }

        int numDigitos = maxLength;
        while(numDigitos > 0) {
            for (int i = 0; i < stringList.size(); i++) {
                String numeroActual = String.valueOf(stringList.get(i).charAt(numDigitos - 1));
                listas.get(Integer.parseInt(numeroActual)).add(stringList.get(i));
            }

            stringList = flattenList(listas);
            listas = new ArrayList<>();
            for(int i = 0; i < 10; i++) {
                listas.add(new ArrayList<>());
            }
            numDigitos--;
        }

        for(int i = 0; i < stringList.size(); i++) {
            arr[i] = Integer.parseInt(stringList.get(i));
        }


    }

    public static void main(String[] args) {
        int[] arr = {16223,898,906,235,23,9,1532,6388,2511,8};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));



    }
}
