import java.util.Arrays;

public class MinJumps {
    public int[] execute(int[] steps){
        int[] dp = new int[steps.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[steps.length-1] = 0;
        for(int i=steps.length-2; i >= 0 ; i--){
            if(i + steps[i] >= steps.length-1){
                dp[i] = 1;
            }else if(steps[i] == 0){
                dp[i] = Integer.MAX_VALUE-steps.length;
            }else{
                for(int j=1; j<=steps[i] && i + j < steps.length; j++){
                    if(  dp[i+j]+1 < dp[i])
                        dp[i] =  dp[i+j]+1;
                }
            }
        }
        return dp;
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 6, 3, 2,
                3, 6, 8, 9, 5};
        int[] result = new MinJumps().execute(input);
        printArr(result);
    }

    private static void printArr(int[] result) {
        for(int i: result){
            System.out.print(i + ",");
        }
    }
}
