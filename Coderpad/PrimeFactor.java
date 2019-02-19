package Coderpad;

import java.util.Map;

public class PrimeFactor {
    public static void main(String[] args) {
        int input = 24;

        for(int i=2; i< Math.sqrt(99);i++){
            while(input % i == 0){
                input = input/i;
                System.out.println(i);
            }
        }
        if(input > 2){
            System.out.println(input);
        }
    }
}
