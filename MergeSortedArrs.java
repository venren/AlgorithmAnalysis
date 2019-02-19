import java.util.PriorityQueue;

public class MergeSortedArrs {
    public static void main(String[] args) {
        int[][] input = {{8,9,16,19,25,29},{0,3,6,7,9,10},{5,7,90,99,100,110}};
        int[] result = merge(input);
        System.out.println();
    }

    private static int[] merge(int[][] input) {

        int firstArrLen = input[0].length;
        int secondArrLen = input[1].length;
        int thirdArrLen = input[2].length;
        int[] resultArr = new int[firstArrLen+secondArrLen+thirdArrLen];
        PriorityQueue<Integer> pq = new PriorityQueue(firstArrLen+secondArrLen+thirdArrLen);

        for(int i=0; i<firstArrLen;i++){
            pq.add(input[0][i]);
        }

        for(int i=0; i<secondArrLen;i++){
            pq.add(input[1][i]);
        }

        for(int i=0; i<thirdArrLen;i++){
            pq.add(input[2][i]);
        }

        int i = 0;
        while(pq.peek() != null){
            resultArr[i] = pq.poll();
            i++;
        }




        return resultArr;
    }

}
