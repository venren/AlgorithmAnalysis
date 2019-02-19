package CoreJava;

public class SingletonHolderPattern {

    private int i = 0;
    public void performOperation(){
        System.out.println("Value of i is" + i++);
    }

    public static SingletonHolderPattern getInstance(){
        return SingletonHolderPatternInstance.instance;
    }

    private static class SingletonHolderPatternInstance {
        private static SingletonHolderPattern instance = new SingletonHolderPattern();
    }
}
