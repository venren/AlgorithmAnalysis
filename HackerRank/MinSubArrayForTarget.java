package HackerRank;

import java.util.Arrays;

public class MinSubArrayForTarget {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8};
        int target = 40;
        Arrays.sort(input);
        System.out.println(execute(input,target));
    }

    private static int execute(int[] input, int target) {
        int sumAchieved = 0;
        int result = 0;
        for(int i=0; i< input.length; i++){
            sumAchieved += input[i];
            result ++;
        }

        if(sumAchieved < target){
            return 0;
        }

        int i = 0;
        while(sumAchieved >= target && i < input.length ){
            if(sumAchieved - input[i] < target)
                break;
            sumAchieved -= input[i];
            result --;
            i++;
        }

        return result;
    }
}
