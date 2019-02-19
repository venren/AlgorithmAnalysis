package steven_skienna;

public class MultiplicationGame {
    public static void main(String[] args) {
        double input = 12226;
        System.out.println(execute(input));
    }

    private static String execute(double input) {
        int start = 1;
        int count = 0;

        while(start < input){
            if(start * 9 >= input){
                start = start * 9;
            }else{
                double nextMax = start * 9;
                double nextMin = start * 2;

                if(nextMax * 9 >= input && nextMin * 9 >= input ){
                    start = start *2;
                }else if(nextMax * 9 >= input){
                    for (int i = 8; i >= 2; i--) {
                        nextMax = start * i;
                        if (nextMax * 9 < input) {
                            start = start * i;
                        }
                    }
                } else{
                    start = start * 9;
                }
            }
            count++;
            System.out.println(start);
        }

        if(count % 2 == 0){
            return "Ollie Wins";
        }else{
            return "Stan Wins";
        }
    }
}
