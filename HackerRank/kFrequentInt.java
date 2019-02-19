package HackerRank;

import java.util.*;

public class kFrequentInt {

    public static void main(String[] args) {
        int[] input = {2,2,2,5,5,6,6,8,8,8,8,4,4,0,1,1,1,1,1,1,3,5,9,8,7};
        execute(input);
    }

    static class Frequency{
        Integer number;
        Integer occurrences;

        public Frequency(Integer number, Integer occurrences) {
            this.number = number;
            this.occurrences = occurrences;
        }

        public Integer getOccurrences() {
            return occurrences;
        }
    }

    private static void execute(int[] input) {
        Map<Integer,Integer> intMap = new HashMap<>();
        for(int i: input){
            intMap.merge(i,1,Integer::sum);
        }

        List<Frequency> frequencies = new ArrayList<>();

        for(Map.Entry<Integer,Integer> e : intMap.entrySet()){
            frequencies.add(new Frequency(e.getKey(),e.getValue()));
        }

        Collections.sort(frequencies, Comparator.comparing(Frequency::getOccurrences).reversed());

        System.out.println(frequencies.get(0).number);
        System.out.println(frequencies.get(1).number);


    }
}
