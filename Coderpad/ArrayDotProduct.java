package Coderpad;

public class ArrayDotProduct {
    public static void main(String[] args) {
        int[] input = {3,-5,4};
        int[] input2 = {2,6,5};

        int len = input.length;
        int result = 0;

        for(int i=0; i<len; i++){
            result += input[i]*input2[i];
        }

        System.out.println(result);
    }
}
