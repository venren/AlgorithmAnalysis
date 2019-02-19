package HackerRank;

public class TestPQ {
    public static void main(String[] args) {
        PQWithHeap<Integer> priorityQueue = new PQWithHeap(Integer.class);
        priorityQueue.insert(9);
        priorityQueue.insert(10);
        priorityQueue.insert(3);
        priorityQueue.insert(1);
        priorityQueue.insert(11);
        priorityQueue.insert(12);
        priorityQueue.insert(8);
        priorityQueue.insert(5);
        priorityQueue.insert(0);
        Integer p =priorityQueue.deQueue();
        while(null != p){
            System.out.println(p);
            p = priorityQueue.deQueue();
        }
    }
}
