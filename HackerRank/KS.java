package HackerRank;

public class KS {
    public static void main(String[] args) {
        int[] val ={60, 100, 120};
        int wt[] = {10, 20, 30};
        int maxWt = 50;
        execute(val,wt,maxWt);
    }

    private static void execute(int[] val, int[] wt, int maxWt) {
        int[][] k = new int[val.length+1][maxWt+1];
        for(int i=0; i<=wt.length;i++){
            for(int j=0; j<=maxWt; j++){
                if( i==0 || j==0){
                    k[i][j] = 0;
                }else if(j>=wt[i-1] ){
                    k[i][j] = Integer.max(val[i-1]+ k[i-1][(j-wt[i-1])], k[i-1][j]);
                }else{
                    k[i][j] = k[i-1][j];
                }

            }
        }
        printArr(k);
    }

    public static void printArr(int[][] a){
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[0].length;j++){
                System.out.print(a[i][j] + ",");
            }
            System.out.println();
        }
    }
}
