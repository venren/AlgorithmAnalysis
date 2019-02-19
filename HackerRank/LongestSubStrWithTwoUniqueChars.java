package HackerRank;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStrWithTwoUniqueChars {
    public static void main(String[] args) {
        String input = "abcbbbbcccbdddadacb";
        execute(input);
    }

    private static void execute(String input) {
        Map<Character,Integer> charMap = new HashMap();
        char[] inputArr = input.toCharArray();

        int runningStart = 0;
        int currentStart = 0;
        int maxStart = currentStart;
        int maxEnd = 0;
        int maxLenSoFar = 0;

        while(runningStart < input.length()){
            Character c = inputArr[runningStart];
            if(!charMap.containsKey(c) && charMap.size() == 2){
                if(runningStart - currentStart > maxLenSoFar){
                    maxStart = currentStart;
                    maxEnd = runningStart;
                    maxLenSoFar = maxEnd-maxStart;
                }
                currentStart += 1;
                runningStart = currentStart;
                charMap.clear();
                continue;
            }else {
                charMap.merge(c, 1, Integer::sum);
                runningStart++;
            }
        }

        System.out.println(input.substring(maxStart,maxEnd));
    }
}
