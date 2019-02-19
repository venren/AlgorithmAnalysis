package CoreJava;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StackUsingOneQueue {

    public class CustomStack{

        Queue<Integer> q = new LinkedList<>();

        public void push(Integer i){
            q.add(i);


            for(int j=0; j<q.size()-1;j++){
                int x = q.remove();
                q.add(x);
            }
        }

        public Integer pop(){
            return q.remove();
        }


    }
    public static void main(String[] args) {

        new StackUsingOneQueue().execute();


    }

    private  void execute() {
        CustomStack cs =new CustomStack();
        cs.push(5);cs.push(50);
        cs.push(10);
        cs.push(100);
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        cs.push(90);
        System.out.println(cs.pop());

    }
}
