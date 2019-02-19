package Coderpad;

import java.util.Stack;

public class QueueusingStack {

    public static class Queue{
        Stack<Integer> s = new Stack();

        public void enQueue(Integer a){
            s.push(a);
        }

        public Integer deQueue(){
            if(s.isEmpty()){
                System.out.println("No element in Queue");
                return null;
            }

            if(s.size() == 1){
                return s.pop();
            }

            int a = s.pop();
            int res = deQueue();
            s.push(a);

            return res;

        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        Integer res = q.deQueue();

        while(res != null){
            System.out.println(res);
            res = q.deQueue();
        }

    }
}
