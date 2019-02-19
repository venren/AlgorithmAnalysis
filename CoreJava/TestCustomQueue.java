package CoreJava;

import Coderpad.CustomMap;

public class TestCustomQueue {
    public static void main(String[] args) {
        CustomQueueImpl<Integer> cq = new CustomQueueImpl();
        cq.enqueue(5);
        cq.enqueue(6);
        cq.enqueue(10);
        System.out.println(cq.deQueue());
        System.out.println(cq.deQueue());
        System.out.println(cq.deQueue());
    }

}
