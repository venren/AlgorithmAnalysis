package CoreJava;

import java.util.concurrent.locks.ReentrantLock;

public enum  EnumSingleton {
    INSTANCE;
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
