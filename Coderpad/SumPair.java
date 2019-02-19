package Coderpad;

import java.util.HashMap;
import java.util.Map;

public class SumPair {
    public static void main(String[] args) {
        int[] input = {1,1};
        int target = 2;
        Map<Integer,Integer> countMap = new HashMap<>();
        int pairCount = 0;

        for(int i: input){
            countMap.merge(i,1,Integer::sum);
        }

        for(int i: input){
            int bal = target - i;

            if(countMap.containsKey(bal)){
                pairCount += countMap.get(bal);
            }


        }

        System.out.println(pairCount/2);
    }
}
