
class ArrayBasic {

    public static void main(String[] args) {
        //   type 1:
        int[] age = new int[5];
        age[0] = 1;
        age[1] = 11;
        // System.out.println(age[0]);

        //   type 2:
        int[] table = {2, 4, 6, 8, 10};
        table[0] = 232;
        table[2] = 0;
        for (int i = 0; i < table.length; i++) {

            // System.out.print(i + ": " + table[i] + ",");
        }

        // Two Dimensional Array (2D Array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                // System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // ## Immutable (Cannot Change) ##
        String s = "saurabh";
        s.concat(" lomte");
        System.out.println(s);

        // ## Mutable (Can Change) ##
        //  StringBuilder & StringBuffer
        //  Used when string changes frequently.
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");
        System.out.println(sb);

        // ###########  Remove duplicate from 'sortrd' array  ############### 
        int[] arr = {0,1,2,2,3,0,4,2};
        int k = 0;
        int val = 2;
        int start = 0;
        int arrLength = arr.length - 1;

        while (start <= arrLength) {
            if (arr[start] == val) {
                int temp = arr[start];
                arr[start] = arr[arrLength];
                arr[arrLength] = temp;
                arrLength--;
                k++;
            }else {
                start++;
            }
        }

        System.err.println("k:" + k);
        for (int i = 0; i < k; i++) {

            System.out.print("" + arr[i] + ",");
        }

        // ###########  String  ############### 
        String name = "Saurabh";
        String name2 = "Sa";

        // System.out.println();
        // name.charAt(0);
        // System.out.println("CharAt 0: " + name.charAt(0));
        // System.out.println("startsWith name2: " + name.startsWith(name2));
        // System.out.println("substring : " + name.substring(0, 3));
    }
}
