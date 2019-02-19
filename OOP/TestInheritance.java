package OOP;

public class TestInheritance {
    public static void main(String[] args) {
       String s = "envious";
       String returned  = execute(s);
        System.out.println(returned == s);
        System.out.println(returned);


    }

    private static String execute(String s) {
        s =  s.toUpperCase();
        return s;
    }
}
