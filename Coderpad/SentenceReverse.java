package Coderpad;

public class SentenceReverse {
    public static void main(String[] args) {
        String input = "This is my home pitch!!";
        char[] inputArr = input.toCharArray();
        for(int i=input.length()-1; i>=0; i--){
            System.out.print(inputArr[i]);
        }
        System.out.println();
        String[] inputSplit = input.split(" ");
        for(int i=inputSplit.length-1; i>=0;i--){
            System.out.print(inputSplit[i]  + " ");
        }
    }
}
