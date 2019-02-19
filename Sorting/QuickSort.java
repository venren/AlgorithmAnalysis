package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] input = {2,4,6,8,9,2,4,6,0};
        execute(input,0,input.length-1);
        printArrray(input);
    }

    private static void printArrray(int[] input) {
        for(int i=0; i< input.length; i++){
            System.out.print(input[i] + ",");

        }
    }

    private static  void execute(int[] input,int left, int right) {
        if(left > right)
            return;

        int partition = partition(input, left, right);
        execute(input,left,partition-1);
        execute(input,partition+1,right);

    }

    private static int partition(int[] input, int left, int right) {
        int i = left -1;
        int pivot = input[right];

        for(int j=left; j<= right-1; j++){
            if(input[j] < pivot ){
                i = i+1;
                swap(input,i,j);
            }
        }
        i = i+1;
        swap(input,i,right);
        return i;

    }

    private static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
