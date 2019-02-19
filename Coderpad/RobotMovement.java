package Coderpad;

public class RobotMovement {
    public static void main(String[] args) {
        String input = "UDDLRL";
        findDestinationCoordinate(input);
    }

    private static void findDestinationCoordinate(String input) {
        int xCo = 0;
        int yCo = 0;
        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;

        char[] inputArr = input.toCharArray();

        for(int i=0; i< inputArr.length; i++){
            if(inputArr[i] == 'L'){
                left++;
            }

            if(inputArr[i] == 'R'){
                right++;
            }

            if(inputArr[i] == 'U'){
                up++;
            }

            if(inputArr[i] == 'D'){
                down++ ;
            }
        }

        xCo = right - left;
        yCo = up - down;

        System.out.println(xCo + ", " + yCo);

    }
}
