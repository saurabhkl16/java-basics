
import java.util.Arrays;

// ## Selection Sort ## 
// Best case : O(n)
// Worst case : O(n^2)
class SelectionSort {

    public static void main(String[] args) {
        int[] myMarks = {98, 76, 34, 88, 50};
        int arrLength = myMarks.length;
        int minimum = 0;

        for (int i = 0; i < arrLength - 1; i++) {
            System.out.println("iteration:" + i);
            for (int j = i + 1; j < arrLength; j++) {
                if (myMarks[minimum] > myMarks[j]) {
                    minimum = j;
                }
            }
            int temp = myMarks[i];
            myMarks[i] = myMarks[minimum];
            myMarks[minimum] = temp;

        }
        System.out.println(Arrays.toString(myMarks));
    }
}
