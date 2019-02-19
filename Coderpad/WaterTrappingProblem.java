package Coderpad;

public class WaterTrappingProblem {
    public static void main(String[] args) {
        int arr[] = {3,0,0,2,0,4};
        findWaterStorage(arr);
    }

    private static void findWaterStorage(int[] arr) {
        int len = arr.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int result = 0;

        left[0] = arr[0];
        for(int i=1; i<len; i++){
            left[i] = Integer.max(left[i-1],arr[i]);
        }

        right[arr.length-1] = arr[arr.length-1];
        for(int i=len-2; i>=0; i--){
            right[i] = Integer.max(right[i+1],arr[i]);
        }

        for (int i=1; i< len-1; i++){
            int storageAtI = Integer.min(left[i],right[i]) - arr[i];
            if(storageAtI > 0) {
                result += storageAtI;
            }

        }
        System.out.println(result);
    }

}
