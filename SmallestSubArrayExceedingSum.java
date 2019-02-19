public class SmallestSubArrayExceedingSum {
    public static void main(String[] args) {
        int[] input=  {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        int target= 280;
        System.out.println(findLenOFMinArr(input,target));
    }

    private static int findLenOFMinArr(int[] input, int target) {
        int left = 0;
        int right = 0;
        int runningSum = 0;
        int minLen = Integer.MAX_VALUE;
        while(right < input.length){
            while(right < input.length && runningSum < target){
                runningSum += input[right];
                right++;
            }

            while(left < input.length && runningSum >= target){
                if(right - left < minLen){
                    minLen = right-left;
                }
                runningSum -= input[left];
                left++;

            }
        }

        return minLen;
    }


}
