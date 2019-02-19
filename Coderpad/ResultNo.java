package Coderpad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ResultNo {
    public static void main(String[] args) {
        int[] input = {11,23,45,67,8};
        int multiplier = 3;
        List<Integer> output = new ArrayList<>();
        for(int i: input){
            int prod = i * multiplier;
            String iString = String.valueOf(i);
            String prodString = String.valueOf(prod);
           if(!isCommonCharacterPresent(iString,prodString)){
               output.add(i);
           }
        }
        output.forEach(System.out::println);
    }

    private static boolean isCommonCharacterPresent(String iString, String prodString) {
        int iStrLen = iString.length();
        int prodStringLen = prodString.length();
        Set<Character> chars = new HashSet<>();

        for(int i=0; i<iStrLen;i++){
            chars.add(iString.charAt(i));
        }

        for(int i=0; i<prodStringLen;i++){
            if(chars.contains(prodString.charAt(i))){
                return true;
            }
        }

        return false;
    }
}
