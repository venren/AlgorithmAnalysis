package DesignPatterns;

public class TestObservable {
    public static void main(String[] args) {
        CustomObservable cs = new CustomObservable();
        CustomObservers sam = new CustomObservers();
        CustomObservers ram = new CustomObservers();
        cs.addObserver(sam);
        cs.addObserver(ram);
        cs.publishMessage("Hi welcome to the group");
    }
}
