package Threading;

public class Shared {
    private Integer val;

    public Shared(Integer v){
        this.val = v;
    }

    public synchronized void update(Shared s1) throws InterruptedException {
        Thread.sleep(1000);
        synchronized (s1){
            Thread.sleep(1000);
            System.out.println("current value is " + val);
            val++;
            System.out.println("Updated value is " + val);
        }
    }

    public synchronized void deduct(Shared s2) throws InterruptedException {
        Thread.sleep(1000);
        synchronized (s2){
            Thread.sleep(1000);
            System.out.println("current value is " + val);
            val--;
            System.out.println("Updated value is " + val);
        }
    }
}
