package Coderpad;

import java.util.*;

public class MaxNumbeArrSequene{
    public static void main(String[] args) {
        Integer[] input = {7,776,7,7};
        List<Integer> inputList = Arrays.asList(input);
        Collections.sort(inputList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return Integer.valueOf(String.valueOf(o2)+ String.valueOf(o1)).compareTo(Integer.valueOf(String.valueOf(o1)+ String.valueOf(o2)));
            }
        });

        inputList.stream().forEach(System.out::println);
    }
}
