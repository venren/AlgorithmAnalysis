public class ContiguousIncreasingSubArr {
    public static void main(String[] args) {
        int[] input = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        int result = execute(input);
        System.out.println(result);
    }

    private static int execute(int[] input) {
        int maxLen = Integer.MIN_VALUE;
        int start = 1;
        int currentStartIndex = start;

        while(currentStartIndex < input.length){
            while(currentStartIndex < input.length && input[currentStartIndex] > input[currentStartIndex-1] ){
                currentStartIndex++;
                if(currentStartIndex-start > maxLen){
                    maxLen = currentStartIndex-start+1;
                }
            }
            start++;
            currentStartIndex = start;
        }

        return maxLen;
    }
}
