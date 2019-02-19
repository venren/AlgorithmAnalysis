package CoreJava;

import java.util.concurrent.locks.ReentrantLock;

public class ClassicSingleton {
    private static ClassicSingleton instance = null;

    private ClassicSingleton(){

    }

    public static ClassicSingleton getInstance(){
        if(instance == null) {
            synchronized (ClassicSingleton.class) {
                if (instance == null) {
                    System.out.println("Creating new instance for thread " + Thread.currentThread().getId());
                    instance = new ClassicSingleton();
                }
            }
        }

        return instance;
    }

    private ReentrantLock _lock = new ReentrantLock();
    private int i = 0;


    public void performOperation(){
        _lock.lock();
        try{
            i++;
            System.out.println("Value of i is " + i + " from thread " + Thread.currentThread().getId());
        }catch (Exception e){
            e.printStackTrace();
        } finally{
            _lock.unlock();
        }
    }
}
