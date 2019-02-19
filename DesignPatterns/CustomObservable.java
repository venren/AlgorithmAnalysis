package DesignPatterns;

import java.util.Observable;
import java.util.Observer;

public class CustomObservable extends Observable {

    public void publishMessage(String message){
        super.setChanged();
        notifyObservers(message);
    }
}
