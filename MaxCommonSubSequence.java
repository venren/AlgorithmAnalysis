public class MaxCommonSubSequence {
    public static void main(String[] args) {
        String a = "abyay";
        String b = "abyaya";
        int[][] forward = exeucte(a,b);
        int[][] reverse = exeucte(new StringBuilder(a).reverse().toString(),new StringBuilder(b).reverse().toString());
        System.out.println(findLongestPalindrome(forward,reverse,a,new StringBuilder(a).reverse().toString()));;
    }

    private static int findLongestPalindrome(int[][] forward, int[][] reverse,String a, String aRev) {

        int reverseColInd = reverse[0].length-1;
        int currentMax = -1;
        for(int i=0;i<forward.length;i++){
            for (int j=0; j<forward[0].length; j++){
                if( forward[i][j] == reverse[i][reverseColInd-j]
                        && forward[i][j] != 0 && a.charAt(i-1) == aRev.charAt(reverseColInd-j) && forward[i][j] > currentMax ){
                    currentMax = forward[i][j];
                }
            }
        }

        return currentMax;
    }

    private static int[][] exeucte(String a, String b) {
        int[][] dp = new int[a.length()+1][b.length()+1];
        for(int i=0; i<a.length()+1;i++){
            for(int j=0; j<b.length()+1;j++){
                if(i ==0 || j==0)
                    dp[i][j] = 0;
                else if(a.charAt(i-1) == b.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = 0;
                }
            }
        }

        return dp;
    }

    private static int[][] exeucte2(String a, String b) {
        int[][] dp = new int[a.length()+1][b.length()+1];
        for(int i=a.length(); i<a.length()+1;i--){
            for(int j=b.length(); j<b.length()+1;j--){
                if(i ==a.length() || j==b.length())
                    dp[i][j] = 0;
                else if(a.charAt(i+1) == b.charAt(j+1)){
                    dp[i][j] = dp[i+1][j-+1]+1;
                }else{
                    dp[i][j] = 0;
                }
            }
        }

        return dp;
    }
}
