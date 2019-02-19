package Coderpad;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {

        String input = "malayalam";
        String anagram = "alamyala";

        System.out.println(isAnagramWithoutBuildIn(input,anagram));
    }

    private static boolean isAnagram(String input, String anagram) {
        if(input.length() != anagram.length())
            return false;

        char[] inputArr = input.toCharArray();
        char[] anagramArr = anagram.toCharArray();

        Arrays.sort(inputArr);
        Arrays.sort(anagramArr);

        return Arrays.equals(inputArr,anagramArr);

    }

    public static boolean isAnagramWithoutBuildIn(String input, String anagram){
        char[] inputCharArr = input.toCharArray();
        char[] anagramArr = anagram.toCharArray();

        Map<Character,Integer> charMap = new HashMap<>();

        for (char c: inputCharArr) {
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c) + 1);
            }else{
                charMap.put(c,1);
            }
        }

        for (char c: anagramArr) {
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c) -1);
            }else{
                return false;
            }
        }

        for (int v: charMap.values()) {
            if(v != 0)
                return false;
        }

        return true;
    }
}
