package Coderpad;

public class StrLenEncoding {
    public static void main(String[] args) {
        String input = "aaaabccdddfddgkkr";
        char previousChar = Character.MIN_VALUE;
        int runningCount = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<input.length();i++){
            if(input.charAt(i) == previousChar){
                runningCount++;
            }else{
                if(previousChar != Character.MIN_VALUE) {
                    stringBuilder.append(previousChar);
                    stringBuilder.append(runningCount);
                }
                previousChar = input.charAt(i);
                runningCount = 1;
            }
        }

        if(previousChar != Character.MIN_VALUE) {
            stringBuilder.append(previousChar);
            stringBuilder.append(runningCount);
        }

        System.out.println(stringBuilder.toString());

    }
}
