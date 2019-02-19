package Coderpad;

public class DuplicatesInArraywithRange {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,4};
        int range = 7;
        int arrSum = 0;

        for(int i = 0; i<input.length; i++){
            arrSum += input[i];
        }

        int formSum = range * ((range+1)/2);

        System.out.println(arrSum - formSum);
    }
}
