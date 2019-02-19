package Tree;

import java.util.Arrays;
import java.util.Random;

public class Stat {
    public static void main(String[] args) {
        int[] input = {5,6,89,20,14,23,56,75,41,29};
        int result = execute(input,0,input.length-1, input.length-1);
        System.out.println(result);
        Arrays.sort(input);
        for (int i: input){
            System.out.print(i + ",");
        }
    }

    private static int execute(int[] input, int left, int right, int k) {
        int pivot = getPivot(left,right);
        int partitionPtr = partition(input,left,right,pivot);
        if(partitionPtr == k)
            return input[k];

        if(partitionPtr < k)
            return execute(input,partitionPtr+1,right,k);

        else
            return execute(input,left,partitionPtr-1,k);

    }

    private static int partition(int[] input, int left, int right,int pivot) {
        int i = -1;
        swap(input,right,pivot);
        for(int j=0; j<right; j++){
            if(input[j] < input[right]){
                i = i+1;
                swap(input,i,j);
            }
        }
        i = i+1;
        swap(input,i,right);
        return i;
    }

    private static void swap(int[] input, int right, int pivot) {
        int temp = input[pivot];
        input[pivot] = input[right];
        input[right] = temp;
    }

    private static int getPivot(int left, int right) {
        Random rnd = new Random();
        return left + rnd.nextInt(right);
    }
}
