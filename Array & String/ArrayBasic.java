
class ArrayBasic {

    public static void main(String[] args) {
        //   type 1:
        int[] age = new int[5];
        age[0] = 1;
        age[1] = 11;
        System.out.println(age[0]);

        //   type 2:
        int[] table = {2, 4, 6, 8, 10};
        table[0] = 232;
        table[2] = 0;
        for (int i = 0; i < table.length; i++) {

            System.out.print(i + ": " + table[i] + ",");
        }

        // Two Dimensional Array (2D Array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
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
    }
}
