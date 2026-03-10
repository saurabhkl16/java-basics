// ## Bubble Sort ## 
// Best case : O(n)
// Worst case : O(n^2)

import java.util.Arrays;

class BubbleSort {

    public static void main(String[] args) {
        int[] myMarks = {95, 1, 267, 3, 4};
        int length = myMarks.length;
        boolean isSwap;

        for (int i = 1; i < length; i++) {
            System.out.println("iteration:" + i);
            isSwap = false;
            for (int j = 0; j < length - i; j++) {
                if (myMarks[j] > myMarks[j + 1]) {
                    System.out.println("swapping:" + j);
                    int temp = myMarks[j];
                    myMarks[j] = myMarks[j + 1];
                    myMarks[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (isSwap == false) {
                break;
            }
        }

        System.out.println(Arrays.toString(myMarks));
    }
}
