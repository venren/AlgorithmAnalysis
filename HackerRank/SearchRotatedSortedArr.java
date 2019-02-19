package HackerRank;

public class SearchRotatedSortedArr {
    public static void main(String[] args) {
        int[] input = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int result = exeucte(input,3,0,input.length-1);
        System.out.println(result);
        
    }

    private static int exeucte(int[] input, int i, int left, int right) {
        if(left >= right)
            return -1;

        int mid = ((right-left)/2)+left;
        if(input[mid] == i)
            return mid;

        if(input[mid] > input[left]) {
            if (input[left] <= i && i <= input[mid]) {
                if (input[left] == i)
                    return left;
                if (input[mid] == i)
                    return mid;
                return exeucte(input, i, left, mid);
            } else {
                return exeucte(input, i, mid, right);
            }
        }

        if(input[mid] <= i && i <= input[right] ){
            if(input[mid] == i)
                return mid;
            if(input[right] == i)
                return right;
            return exeucte(input,i,mid,right);
        }
            return exeucte(input,i,left,mid);


    }
}
