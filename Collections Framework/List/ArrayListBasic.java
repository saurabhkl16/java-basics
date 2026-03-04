// ✅ 1. List (ArrayList, LinkedList)

// 👉 List allows:
// ✅ Duplicate values
// ✅ Ordered data
// ✅ Index-based access
import java.util.ArrayList;
import java.util.Scanner;

class ArrayListBasic {

    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList();
        // list.add("sdsd");
        // list.add("32");
        // list.remove("32");
        // list.set(0, "Saurabh");
        // list.add(0, "Lomte");
        // System.out.println(list);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        int count = 1;

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            if (i > 0 && list.get(i) == max) {
                count++;
            }
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println(count + " " + max);

    }
}
