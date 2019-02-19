package CoreJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomQueueImpl<T> implements Iterable<T> {

    private List<T> l = new ArrayList();

    public void enqueue(T i){
        l.add(i);
    }

    public T deQueue(){
      T result = l.get(0);
      l.remove(0);
      return result;
    }

    @Override
    public Iterator<T> iterator() {
        return l.iterator();
    }


}
