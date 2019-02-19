package Coderpad;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        int input = 9990;
        List<Integer> primeFactors = new ArrayList<>();

        for(int i=2; i<Math.sqrt(input);i++){
            while(input%i == 0){
                input = input/i;
                primeFactors.add(i);
            }
        }

        if(input > 2){
            primeFactors.add(input);
        }

        primeFactors.stream().forEach(System.out::println);
    }
}
