import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class inCoin {
    public static void main(String[] args) {
        int[] coins = {9,6,1};
        int result = 11;
        Integer r = execute(coins,result);
        System.out.println(r);
    }

    private static int execute(int[] coins, int result) {
        int[] dp = new int[result+1];
        int[] from = new int[result+1];


        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=0; i<result+1;i++){
            for(int j=0; j<coins.length;j++){
                if(coins[j] <= i && dp[i-coins[j]] != Integer.MAX_VALUE
                        && dp[i-coins[j]] + 1 < dp[i]){

                        dp[i] =  dp[i - coins[j]]+1;
                        from[i] = j;

                }
            }
        }

        return dp[result];
    }
}