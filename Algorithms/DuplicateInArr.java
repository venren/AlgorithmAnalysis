package Algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateInArr {


    public static void main(String[] args) {
        int[] input = {2, 4, 7, 5, 9, 10, -1};
        int target = 9;

         execute(input,target);
    }

    private static void  execute(int[] input, int target) {
        Set<Integer> s = new HashSet<>();
        Arrays.sort(input);
        for(int i=0; i< input.length;i++){
            s.add(input[i]);
        }
        for(int i=0; i<(input.length/2);i++){
            int bal = target - input[i];
            if(s.contains(bal)){
                System.out.println("Pair  " + input[i] + "," + bal);
            }
        }
    }
}
