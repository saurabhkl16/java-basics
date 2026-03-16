
import java.util.Arrays;

// ## Selection Sort ## 
// Best case : O(n)
// Worst case : O(n^2)
// change only index first then swap;
class SelectionSort {

    public static void main(String[] args) {
        int[] myMarks = {98, 76, 34, 88, 50, 5};
        int arrLength = myMarks.length;
        int minimum = 0;
        boolean isMinValChange;

        for (int i = 0; i < arrLength - 1; i++) {
            minimum = i;
            isMinValChange = false;
            for (int j = i + 1; j < arrLength; j++) {
                if (myMarks[minimum] > myMarks[j]) {
                    minimum = j;
                    isMinValChange = true;
                }
            }
            int temp = myMarks[i];
            myMarks[i] = myMarks[minimum];
            myMarks[minimum] = temp;
            if (isMinValChange == false) {
                break;
            }
        }
        System.out.println(minimum);
        System.out.println(Arrays.toString(myMarks));
    }
}
