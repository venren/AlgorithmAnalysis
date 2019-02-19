package Coderpad;

public class MedianOfSortedArr {
    public static void main(String[] args) {
        int[] inputArr1 = {7,9,11,12};
        int[] inputArr2 = {5,8,10,20};

        int totalLen = inputArr1.length + inputArr2.length;
        int prevElem = -1;
        int currElem = -1;
        int i=0;
                int j=0;

        for(int k=0; k<=totalLen/2; k++){
            prevElem = currElem;
            currElem = (inputArr1[i] < inputArr2[j]) ? inputArr1[i++] : inputArr2[j++];
        }

        if(totalLen%2 == 0)
            System.out.println((currElem+prevElem)/2);
        else
            System.out.println(currElem);
    }
}
