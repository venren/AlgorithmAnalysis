package HackerRank;

public class Tribonnaci {
    public static void main(String[] args) {
        for(int i=0;i<10; i++){
            System.out.println(execute(i));
        }

    }

    private static int execute(int i) {
        if(i == 0) return 0;
        if(i == 1 || i==2) return 1;

        return execute(i-1) + execute(i-2)+execute(i-3);


    }

}
