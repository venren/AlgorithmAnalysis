package Coderpad;

public class UglyNumber {
    public static void main(String[] args) {
        int input = 15;
        printUglyNumbersTill(input);
    }

    private static void printUglyNumbersTill(int input) {

        int i = 1;
        int startingNumber = 2;

        while(i < input){
            int currentNumber = startingNumber;
            while(currentNumber%2 == 0){
                currentNumber = currentNumber/2;
            }

            while(currentNumber%3 == 0){
                currentNumber = currentNumber/3;
            }

            while(currentNumber%5 == 0){
                currentNumber = currentNumber/5;
            }

            if(currentNumber == 1){
                System.out.println(startingNumber);
                i++;

            }
            startingNumber = startingNumber+1;
        }
    }

}
