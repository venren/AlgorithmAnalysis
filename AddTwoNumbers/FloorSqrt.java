package AddTwoNumbers;

public class FloorSqrt {
    public static void main(String[] args) {
        int i = 121;
        System.out.println(squareRoot(i));
    }

    private static int squareRoot(int i) {
        int start = 1;
        int end = i;
        int result = 0;

        while (start < end){
            int mid = ((end-start)/2) +start;

            int midSq = mid * mid;

            if(i == midSq) {
                result = mid;
                break;
            }

            if(i> midSq) {
                start = mid + 1;
                result = mid;


            }

            else {
                end = mid - 1;


            }
        }

        return result;
    }
}
