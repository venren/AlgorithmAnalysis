package Coderpad;

public class Stair {
    public static void main(String[] args) {


        System.out.println(execute(11,3));
    }

    private static int execute(int i,int noOfPoss) {
        int[] numOfPossiblities = new int[i+1];
        numOfPossiblities[0] = 1;
        numOfPossiblities[1] = 1;


        for(int j =2; j<=i; j++){
            for(int k=1; k<=noOfPoss && k<=j; k++){
                numOfPossiblities[j]  += numOfPossiblities[j-k];
            }
        }

        return numOfPossiblities[i];

    }
}
