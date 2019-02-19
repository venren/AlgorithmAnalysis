package CoreJava;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestClassicSingleton {
    public static void main(String[] args) {
        Runnable r = () -> {ClassicSingleton.getInstance().performOperation();};
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();t2.start();
    }
}
