package Design;


import java.util.HashMap;
import java.util.Map;

public class LRUCache<T> {
    public class Node<T>{
        Integer key;
        T data;
        Node next;
        Node previous;
    }

    private static final int MAX_CAPACITY = 100;
    private Node<T> head;
    private Node<T> tail;

    Map<Integer,Node> m = new HashMap<>();

    public void set(int key,T data){
        if(m.containsKey(key)){
            Node n = m.get(key);
            setHead(n);
            remove(n);
        }else{
            if(m.size() >= MAX_CAPACITY){
                remove(tail);
                m.remove(tail.key);
            }
            Node nodeToBeInserted = new Node();
            nodeToBeInserted.key = key;
            nodeToBeInserted.data = data;
            setHead(nodeToBeInserted);
            m.put(key,nodeToBeInserted);
        }

    }

    public T get(int key){
        if(m.containsKey(key)){
            Node n = m.get(key);
            remove(n);
            setHead(n);

        }
        return null;
    }

    private void setHead(Node n) {
        if(head == null){
            head = n;

        }

        else if(head != null && !(head.key.equals(n.key) && head.data.equals(n.data))) {
            head.previous = n;
            n.next = head;
            head = n;
        }

        if(tail == null){
            tail = n;
        }




    }

    private void remove(Node n){
        Node prev = n.previous;
        if (prev != null) {
            prev.next = n.next;
            if(n.next == null){
                tail = prev;
            }
        }
        n = null;
    }
}
