// ✅ 2. Set (HashSet, TreeSet)
// 👉 Set means:
// ❌ No duplicates allowed
// ✅ Fast
// ❌ No order guarantee <= imp

import java.util.HashSet;
import java.util.TreeSet;

class HashSetBasic {

    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(11);
        hs.add(21);
        hs.add(31);
        hs.add(1);
        System.out.println(hs.size());

        TreeSet<Integer> set = new TreeSet<>();
        // ✅ Sorted automatically
        // ❌ Slightly slower

        set.add(130);
        set.add(30);
        set.add(10);
        set.add(20);
        System.out.println("set: " + set);
    }
}
