package Coderpad;

import java.util.HashSet;
import java.util.Set;

public class PositionalElement {
    public static void main(String[] args) {
        int[][] input =  {{1, 1}, {1, 1}, {1, 1}};

        Set<Integer> posElementCount = new HashSet<>();

        int[] rowMin = new int[input.length];
        int[] rowMax = new int[input.length];
        int[] colMin = new int[input[0].length];
        int[] colMax = new int[input[0].length];

        for(int i=0; i< input.length; i++){
            for (int j=0; j< input[0].length; j++){
                if(input[i][j] > rowMax[i]){
                    rowMax[i] = input[i][j];
                }

                if(rowMin[i] != 0 && input[i][j] < rowMin[i]){
                    rowMin[i] = input[i][j];
                }else if(rowMin[i] == 0 ){
                    rowMin[i] = input[i][j];
                }

                if(input[i][j] > colMax[j]){
                    colMax[j] = input[i][j];
                }

                if(colMin[j] != 0 && input[i][j] < colMax[j]){
                    colMin[j] = input[i][j];
                }else if(colMin[j] == 0 ){
                    colMin[j] = input[i][j];
                }
            }
        }

        for(int i=0; i<input.length; i++){
            posElementCount.add(rowMax[i]);
            posElementCount.add(rowMin[i]);
        }

        for(int i=0; i<input[0].length; i++){
            posElementCount.add(colMax[i]);
            posElementCount.add(colMin[i]);
        }

        System.out.println(posElementCount.size());


    }
}
