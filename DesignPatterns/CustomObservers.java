package DesignPatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class CustomObservers implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Received message " + arg.toString());
    }
}
