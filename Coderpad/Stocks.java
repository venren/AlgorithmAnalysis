package Coderpad;

import java.util.ArrayList;
import java.util.List;

public class Stocks{

    public static class Order{
        public int day;
        public float amount;

        public Order(int d, float a){
            day = d;
            amount = a;
        }
    }

    public static class Transaction{
        Order buy;
        Order sell;
    }
    
    public static void main(String args[]){
        int[] input = {120,100,96,180,150,140,160,190,65,100,150,199,200,210,215,220,199,185,155};
        execute(input);

    }

    private static void execute(int[] input) {
        int i=0;
        List<Transaction> transactions = new ArrayList<>();
        while(i <= input.length-1){
            Transaction t = new Transaction();
            while(i <= input.length -2 && input[i] > input[i+1] ){
                i++;
            }

            t.buy = new Order(i,input[i]);
            i=i+1;

            if( i >= input.length)
                break;


            while(i <= input.length -1 && input[i] < input[i+1] ){
                i++;
            }


            t.sell = new Order(i,input[i]);
            i = i+1;


            transactions.add(t);



        }

        transactions.forEach(t -> {
            System.out.println("But on " + t.buy.day + " day with amount" + t.buy.amount
                    + " and sell on "+ t.sell.day + "  day with amount " + t.sell.amount);
        });
    }
}