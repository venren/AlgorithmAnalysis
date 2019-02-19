import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianOfStreamOfIntegers {
    public static void main(String[] args) {
        int[] input = {5, 15, 1, 3, 2, 8, 7, 9, 10, 6, 11, 4};
        double median = execute(input);
    }

    private static double execute(int[] input) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.naturalOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.reverseOrder());
        double median = 0;

        for(int i=0; i<input.length;i++){
            int compareHeapSize = Integer.valueOf(maxHeap.size()).compareTo(Integer.valueOf(minHeap.size()));
            switch (compareHeapSize){
                case 1:
                    if(input[i] > median){
                        minHeap.add(maxHeap.poll());
                        maxHeap.add(input[i]);
                    }else{
                        minHeap.add(input[i]);
                    }
                    median = (minHeap.peek()+maxHeap.peek())/2.0;
                    continue;

                case -1:
                    if(input[i] > median){

                        maxHeap.add(input[i]);
                    }else{
                        maxHeap.add(minHeap.poll());
                        minHeap.add(input[i]);
                    }
                    median = (minHeap.peek()+maxHeap.peek())/2.0;
                    continue;

                case 0:
                    if(input[i] > median){

                        maxHeap.add(input[i]);
                        median = maxHeap.peek();
                    }else{

                        minHeap.add(input[i]);
                        median = minHeap.peek();
                    }
                    continue;

            }


        }
        System.out.println(median);
        return median;

    }
}
