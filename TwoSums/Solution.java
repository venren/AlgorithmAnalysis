package TwoSums;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] execute(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer,Integer> indexMap = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            int balance = target - nums[i];
            if(indexMap.get(balance) != null){
                result[0] = indexMap.get(balance);
                result[1] = i;
                break;
            }
            indexMap.put(nums[i],i);
        }
        return result;
    }
}
