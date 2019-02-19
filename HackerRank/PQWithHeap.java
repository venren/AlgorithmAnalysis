package HackerRank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PQWithHeap<T extends Comparable> {
   private int INITIAL_LENGTH = 16;
   T[] entries = null;
   int filledCapacity = 0;

   public PQWithHeap(Class<T> tClass){
       entries = (T[]) new Comparable[INITIAL_LENGTH];
   }

    public void insert(T data){
        int index = 0;
        if(filledCapacity == 0) {
            entries[index] = data;

        }else{
            if(filledCapacity >= INITIAL_LENGTH-6){
                INITIAL_LENGTH = INITIAL_LENGTH*2;
                T[] newEntries = (T[])new Object[filledCapacity*2];
                newEntries = Arrays.copyOf(entries,INITIAL_LENGTH);
                entries = newEntries;
                newEntries = null;
            }else{
                index = filledCapacity;
                entries[index] = data;
            }
        }
        filledCapacity++;
        for(int i=filledCapacity/2; i>=0; i--)
            heapify(entries,i,filledCapacity);
    }

    public T deQueue(){
       T result = entries[0];
       for(int i=1; i<=filledCapacity; i++){
           entries[i-1] = entries[i];
       }
       filledCapacity--;
       heapify(entries,0,filledCapacity);
       return result;
    }

    private void heapify(T[] entries, int filledCapacity, int right) {
       int leftChild = filledCapacity*2+1;
       int rightChild = filledCapacity*2 + 2;
       int result = filledCapacity;

       if(leftChild < right && entries[result].compareTo(entries[leftChild]) < 0){
           result = leftChild;
       }

        if(rightChild < right &&  entries[result].compareTo(entries[rightChild]) < 0){
            result = rightChild;
        }

        if(result != filledCapacity){
            T temp = entries[filledCapacity];
            entries[filledCapacity] = entries[result];
            entries[result] = temp;
            heapify(entries,result,right);
        }
    }
}
