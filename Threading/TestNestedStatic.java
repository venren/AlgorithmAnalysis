package Threading;

public class TestNestedStatic {
    public static void main(String[] args) throws InterruptedException {
        NestedStatic.Nested nested = new NestedStatic.Nested();
        NestedStatic.Nested nested1 = new NestedStatic.Nested();
        Runnable r1 = () -> {
            try {
                nested.randomMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable r2 = () -> {
            try {
                nested1.anotherRandomMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();t2.start();
        t1.join();t2.join();
    }
}
