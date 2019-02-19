package Threading;

import java.util.Calendar;

public class DeadlockScenario {
    public static void main(String[] args) throws InterruptedException {
        Calendar.getInstance();
        Shared s1 = new Shared(1);
        Shared s2 = new Shared(2);
        Runnable r = () -> {
            try {
                s1.deduct(s2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable r1 = () -> {
            try {
                s2.update(s1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
