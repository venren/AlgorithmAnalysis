package Java8;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Lamda {
    private static final Holder someInstanceVariable = new Holder(1);

    public static boolean isEven(int a){
        return a%2 == 0;
    }

    public static boolean isOdd(int a){
        return a%2 == 0;
    }

    public static void main(String[] args) {
       IntPredicate f = (i) -> isEven(i);
       printStream(f);
    }

    private static void printStream(IntPredicate f) {
        IntStream.range(0,100)
                .filter(f)
                .forEach(System.out::println);
    }


}
