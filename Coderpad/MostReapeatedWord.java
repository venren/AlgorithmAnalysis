package Coderpad;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostReapeatedWord {
    public static void main(String[] args) {
        String[] input = {"abc","abc","abc","abc","def","def","def","def","ghi","ghi","ghi","ghi","ghi","jkl"};
        Map<String,Integer> strCount = new HashMap<>();

        for(String i: input){
            strCount.merge(i,1,Integer::sum);
        }

        int firstMax = 0;
        int secondMax = 0;
        String firstMaxString = "";
        String result = "";

        for(Map.Entry<String,Integer> e : strCount.entrySet()){
            if(e.getValue() > firstMax){
                secondMax = firstMax;
                result = firstMaxString;
                firstMaxString = e.getKey();
                firstMax = e.getValue();
            }else if(e.getValue() > secondMax){
                secondMax = e.getValue();
                result = e.getKey();
            }
        }

        System.out.println(result);
    }
}
