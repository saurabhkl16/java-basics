// ✅ 3. Map (HashMap, TreeMap)
// Map stores Key → Value pair.
// Key = Unique.
// Value = Duplicate allowed.

import java.util.HashMap;
import java.util.TreeMap;

class MapBasic {

    public static void main(String[] args) {
        // HashMap
        // ❌ Unordered
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Python");

        System.out.println(map);

        // TreeMap
        // ✅ Sorted by key
        TreeMap<Integer, String> map2 = new TreeMap<>();

        map2.put(4, "Csd");
        map2.put(3, "C");
        map2.put(1, "Java");
        System.out.println(map2);
    }
}



// 🔥 Interview Golden Line

// ✅ List → Ordered + Duplicate
// ✅ Set → Unique values
// ✅ Map → Key-Value pair