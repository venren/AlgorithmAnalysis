import java.util.Arrays;

public class MinCoin {
    public static void main(String[] args) {
        int[] coins = {9,6,1};
        int totalAmount = 11;
        execute(coins,totalAmount);
        
    }

    private static void execute(int[] coins, int totalAmount) {
        int[] dp = new int[totalAmount+1];
        int[] from  = new int[totalAmount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);

        dp[0] = 0;

        for(int i=1; i<totalAmount+1; i++){
            for(int j=0; j<coins.length;j++){
                if(i >= coins[j]){
                    if( dp[i-coins[j]] != Integer.MAX_VALUE && dp[i-coins[j]] + 1 < dp[i]) {
                        dp[i] = 1 + dp[i - coins[j]];
                        from[i] = j;
                    }
                }
            }
        }

        System.out.println("Minimum number of coins to get total " + totalAmount + "  " +  dp[totalAmount-1]);
        System.out.println("Coins for getting total amount");
        System.out.println();
        while(totalAmount > 0){
            System.out.print(coins[from[totalAmount]] + ",");
            totalAmount -= coins[from[totalAmount]];
        }

    }


}
