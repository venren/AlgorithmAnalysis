package Coderpad;

public class AddFraction {
    public static void main(String[] args) {
        int num1 = 1;
        int den1 = 500;
        int num2 = 2;
        int den2 = 1500;
        int den3 = den1 * den2;
        int num3 = (num1 * den2) + (num2 * den1);

        try {
            minimize(num3, den3);
        }catch (IllegalArgumentException ile){
            System.out.println("Invalid argument!!");

        }

    }

    private static void minimize(int num3, int den3)throws IllegalArgumentException {

        if(den3 == 0) throw new IllegalArgumentException("Invalid denominator!!");

        int gcd =  gcd(num3, den3);
        num3 = num3/gcd;
        den3 = den3/gcd;
        System.out.println("Numerator" + num3);
        System.out.println("Denominator" + den3);
    }

    private static int gcd(int num3, int den3) {
        if(num3 == 0) return den3;

        return gcd(den3%num3, num3);
    }
}
