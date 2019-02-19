package CoreJava;

public class DeadLockScenario {

    public class Shared{

        public synchronized void test(Shared s2) throws InterruptedException {

                System.out.println("Sleeping for some time in test!!!");
                Thread.sleep(1000);
            s2.testAgain(this);

        }

        private synchronized void testAgain(Shared s2) throws InterruptedException {

                System.out.println("Sleeping for some time in test Again!!!");
                Thread.sleep(1000);
            s2.test(this);

        }

    }


    public static void main(String[] args) {
        new DeadLockScenario().execute();

    }

    public void execute(){
        Shared s1 = new Shared();
        Shared s2 = new Shared();

        Runnable r = () -> {
            try {
                s1.test(s2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable r2 = () -> {
            try {
                s2.test(s1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
