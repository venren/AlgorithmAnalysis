package CoreJava;

import java.util.Stack;

public class QueueUsingOneStack {
    public static class Customstack{
        Stack<Integer> s = new Stack<>();

        public void enQueue(Integer a){
            s.push(a);
        }

        public Integer dequeue(){
            if(s.isEmpty()) {
                System.out.println("Queue is empty");
                    return null;
            }else if(s.size() == 1){
                return s.pop();
            }else{
                Integer x = s.pop();

                Integer res = dequeue();

                s.push(x);
                return res;
            }





        }
    }

    public static void main(String[] args) {
        Customstack cs = new Customstack();
        cs.enQueue(5);
        cs.enQueue(6);
        cs.enQueue(8);
        System.out.println(cs.dequeue());
        System.out.println(cs.dequeue());
        System.out.println(cs.dequeue());


    }
}
