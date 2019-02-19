package CoreJava;

public class TestSingletonHolder {
    public static void main(String[] args) {
        Runnable r = () -> {SingletonHolderPattern.getInstance().performOperation();};

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();t2.start();

    }
}
