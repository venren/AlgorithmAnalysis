import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UniqueConnections {

    public static class Pair{
        Integer x1;
        Integer y1;
        Integer x2;
        Integer y2;

        public Pair(int x1, int y1, int x2, int y2){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public boolean equals(Object o) {
            if (o == null)
                return false;

            if (this == o)
                return true;

            if (this.getClass() != o.getClass())
                return false;

            Pair that = (Pair) o;

            return ((
                    Objects.equals(this.x1, that.x1) &&
                            Objects.equals(this.x2, that.x2) &&
                            Objects.equals(this.y1, that.y1) &&
                            Objects.equals(this.y2, that.y2)
            ) || (
                    Objects.equals(this.x1, that.x2) &&
                            Objects.equals(this.x2, that.x1) &&
                            Objects.equals(this.y1, that.y2) &&
                            Objects.equals(this.y2, that.y1)
            ));

        }

        @Override
        public int hashCode() {
            int prime = 31;
            return prime * (x1+x2+y1+y2);
        }
    }

    public static void addPairs(int[][] mat, int i, int j, Set<Pair> pairs){
        int[] row = {1,1,1,-1,-1,-1,0,0};
        int[] col = {0,-1,1,0,-1,1,1,-1};
        for(int r = 0; r<row.length; r++){
            if(i+row[r] < mat.length && i+row[r] >= 0 && j + col[r] < mat[i+row[r]].length
            && j+col[r] >= 0 && mat[i+row[r]][j+col[r]] == 1){
                pairs.add(new Pair(i,j,i+row[r],j+col[r]));
            }
        }
    }

    public static int findUniquePairs(int[][] mat){
        Set<Pair> pairs = new HashSet<>();
        for(int i=0; i< mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == 1)
                    addPairs(mat,i,j,pairs);
            }
        }

        return pairs.size();
    }


    public static void main(String[] args) {
        int[][] input = {{1,0,0,1},{0,1,1,1},{1,0,0,1}};
        System.out.println(findUniquePairs(input));
    }
}
