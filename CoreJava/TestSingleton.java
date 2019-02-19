package CoreJava;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleton {
    public static void main(String[] args) {
        Runnable r = () -> {EnumSingleton e = EnumSingleton.INSTANCE; e.performOperation();};
        Executor e = Executors.newFixedThreadPool(10);
        for(int i=10000; i>=0; i--){
            ((ExecutorService) e).submit(r);
        }
    }


}
