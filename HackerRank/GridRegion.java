package HackerRank;

/**
 * https://www.hackerrank.com/challenges/connected-cell-in-a-grid/forum
 */
public class GridRegion {
    private int[][] input = null;
    private int rows = 0;
    private int cols = 0;

    public void setInput(int[][] i){
        input = i;
        if(null != i){
            rows = i.length;
            cols = i[0].length;
        }
    }

    int findLargestRegion(){
        int result = 0;
        if(null == input)
            return 0;

        if(rows == 1 && cols == 1){
            if(input[0][0] == 1)
                return 1;
            else
                return 0;
        }

        for(int i=0; i< rows; i++){
            for(int j=0; j< cols; j++){
                if(input[i][j] == 1) {
                    int size = findSize(input, i, j);
                    result = Math.max(result, size);
                }
            }
        }

        return result;
    }

    private int findSize(int[][] input, int i, int j) {
        if(i < 0 || i >= rows || j < 0 || j >= cols) {
            return 0;
        }
        if(input[i][j] == 0){
            return 0;
        }

        input[i][j] = 0;
        int size = 1;

        for(int r = i-1; r<= i+1; r++){
          for(int c = j-1; c <= j+1; c++){
             size += findSize(input,r,c);
          }
        }

        return size;
    }
}