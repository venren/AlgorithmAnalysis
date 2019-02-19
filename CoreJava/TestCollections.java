package CoreJava;

import java.util.*;

public class TestCollections{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        Iterator<Integer> lItr = l.iterator();
        int i = 1;
        while (lItr.hasNext()){
            lItr.next();
            if(i==2)
                lItr.remove();
            i++;
        }

        l.forEach(System.out::println);

    }
}
