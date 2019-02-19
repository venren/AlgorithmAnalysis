import java.util.Arrays;
import java.util.Scanner;

public class DecodeNumber {
    public static void main(String[] args) {
        String input = "218765";
        System.out.println(execute(input));
    }

    private static String execute(String input) {
        char[] charArr = input.toCharArray();
        int swapFirstDigitIndex = -1;
        int swapSecondDigitIndex = -1;
        for(int i = charArr.length-2; i>= 0; i--){
            if(charArr[i] < charArr[i+1]){
                swapFirstDigitIndex = i;
            }
        }

        if(swapFirstDigitIndex == -1)
            return "NOT POSSIBLE";

        int nextMax = Integer.MAX_VALUE;
        for(int i = charArr.length-1; i> swapFirstDigitIndex; i--){
            if(charArr[i] > charArr[swapFirstDigitIndex] && charArr[i] < nextMax){
                nextMax = charArr[i];
                swapSecondDigitIndex = i;
            }
        }

        swap(charArr,swapFirstDigitIndex,swapSecondDigitIndex);
        char[] tempArr = Arrays.copyOfRange(charArr,swapFirstDigitIndex+1,charArr.length);
        return new String(Arrays.copyOfRange(charArr,0,swapFirstDigitIndex)) +
                new String (tempArr);
    }

    private static void swap(char[] charArr, int swapFirstDigitIndex, int swapSecondDigitIndex) {
        char temp = charArr[swapFirstDigitIndex];
        charArr[swapFirstDigitIndex] = charArr[swapSecondDigitIndex];
        charArr[swapSecondDigitIndex] = temp;
    }


}
