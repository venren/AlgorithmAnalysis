package Coderpad;

public class CustomMap<K,V>{
    private int CURRENT_CAPACITY = 16;

    public static class Entry<K,V>{
            K key;
            V value;
            Entry<K,V> next;

            public Entry(K key, V value, Entry<K,V> n){
                this.key = key;
                this.value = value;
                this.next = n;
            }
    }

    Entry[] values = new Entry[CURRENT_CAPACITY];

    public void put(K key, V value){
        int position = hash(key);
        boolean inserted = false;
        Entry toBeInserted = new Entry<>(key,value,null);
        if(values[position] == null){
            values[position]= toBeInserted;
        }else{
            Entry current = values[position];
            Entry previous = null;
            while(null != current){
                if(current.key.equals(key)){
                    System.out.println("Entry found already for given key. Overriding it.");
                    current.value = value;
                    inserted = true;
                    break;
                }
                previous = current;
                current = current.next;
            }
            if(!inserted)
                previous.next = toBeInserted;
        }
    }

    public V get(K key){
        int position = hash(key);
        if(values[position] == null){
            System.out.println("No entry found for given key");
        }else{
            Entry<K,V> current = values[position];
            while(null != current){
                if(current.key.equals(key)){
                   return current.value;
                }
            }
        }
        return null;
    }

    public int hash(K key){
        return key.hashCode() % CURRENT_CAPACITY;
    }
}
