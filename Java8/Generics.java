package Java8;

import java.util.*;

public class Generics {
    public static void main(String[] args) {
        Map<Holder,Integer> map = new HashMap<>();
        map.put(new Holder(22),90);
        System.out.println(map.get(new Dummyholder()));
    }
}
