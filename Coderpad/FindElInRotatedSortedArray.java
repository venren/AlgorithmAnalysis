package Coderpad;

public class FindElInRotatedSortedArray {
    public static void main(String[] args) {
        int[] input = {5,6,7,8,1,2,3};
        int target = 2;
        System.out.println(execute(input,target));
    }

    private static int execute(int[] input, int target) {

        int right = input.length-1;
        int left = 0;

        while(left < right){
            int mid = right-left/2;
            if(input[mid] == target)
                return mid;

            if(input[mid] > input[left]){
                if(input[mid] > target && input[left] <= target){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else {
                if(input[mid] < target && input[right] >= target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }


        }
        return -1;
    }
}
