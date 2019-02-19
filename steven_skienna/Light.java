package steven_skienna;

/**
 * https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1051
 */
public class Light {
    public static void main(String[] args) {
        double input = 8191;
        System.out.println(execute(input));
    }

    private static String execute(double input) {
        if(isPerfectSquare(input)){
            return "Yes";
        }else{
            return "No";
        }
    }

    private static boolean isPerfectSquare(double input) {
        double result = Math.sqrt(input);
        double ceil = Math.ceil(result);
        return result == ceil;
    }
}
