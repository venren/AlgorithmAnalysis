package Threading;

public class NestedStatic {
    public static class Nested{
        public synchronized void randomMethod() throws InterruptedException {
            System.out.println("Entered random method");
            Thread.sleep(1000);
            System.out.println("Printing from random method !!!");
            Thread.sleep(1000);
            System.out.println("Exited random method");
        }

        public synchronized void anotherRandomMethod() throws InterruptedException {
            System.out.println("Entered another random method");
            Thread.sleep(1000);
            System.out.println("Printing from another random method !!!");
            Thread.sleep(1000);
            System.out.println("Exited another random method");
        }
    }
}
