package Threading;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class CountDownLatchExample {
    public static void main(String[] args) {
        CountDownLatch downLatch = new CountDownLatch(100);
        List<Runnable> threads = new ArrayList<>();
        IntStream.range(0,200).forEach(i -> {
            Runnable r = ()-> {
                System.out.println("Sleeping for some time");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Decrementing the latch");
                downLatch.countDown();
                System.out.println("Current count is " + downLatch.getCount());
            };
            threads.add(r);
        });
        Runnable r1 = () -> {
            try {
                System.out.println("Executing thread waiting for count down timer to become 0");
                downLatch.await();
                System.out.println("All threads completed ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };


        Executor e = Executors.newFixedThreadPool(10);
        ((ExecutorService) e).submit(r1);
        for (Runnable r:threads) {
            ((ExecutorService) e).submit(r);
        }
    }
}
