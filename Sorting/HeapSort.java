package Sorting;

public class HeapSort {
    public static void main(String[] args) {
        int[] input = {90,34,55,65,21,9,2,3,1,0,89,80};
        execute(input,0,input.length-1);

        printArr(input);
    }

    private static void execute(int[] input, int l, int r) {

        if(r<=l)
            return;

        int mid = ((r-l)+l)/2;
        for(int i=mid; i>=0; i--)
            heapify(input,i,l,r);

        int temp = input[l];
        input[l] = input[r];
        input[r] = temp;

        execute(input,l,r-1);

    }

    private static void printArr(int[] input) {
        for(int i=0;i<input.length;i++){
            System.out.println(input[i]);
        }
    }

    private static void heapify(int[] input, int mid, int l, int r) {
        int left = (2*mid)+1;
        int right = (2*mid)+2;
        int result = mid;
        int toBeCompared = input[mid];

        if(left <= r && input[left] > toBeCompared){
            result = left;
            toBeCompared = input[left];
        }

        if(right <= r && input[right] > toBeCompared){
            result = right;
        }

        if(result != mid){
            int temp = input[mid];
            input[mid] = input[result];
            input[result] = temp;
            heapify(input,result,l,r);
        }
    }
}
