package Coderpad;

public class MatrixTraversal {
    public static void main(String[] args) {
        int[][] input = {
                            {1,2}


                        };

        if(input.length == 1 &&  input[0].length == 1)
            System.out.println(input[0][0]);
        int[][] costMatrix = new int[input.length][input[0].length];

        costMatrix[input.length-1][0] = input[input.length-1][0];

        for(int j = 1; j<input[0].length; j++){
            costMatrix[input.length-1][j] = costMatrix[input.length-1][j-1] + input[input.length -1][j];
        }

        for(int i=input.length-2; i >=0 ; i--){
            costMatrix[i][0] = costMatrix[i+1][0] + input[i][0];
        }

        for(int i=input.length-2; i >=0 ; i--){
            for(int j = 1; j<input[0].length; j++){
                costMatrix[i][j] = Integer.max(costMatrix[i][j-1] , costMatrix[i+1][j]) + input[i][j];
            }
        }

        System.out.println(costMatrix[0][input[0].length-1]);
    }
}