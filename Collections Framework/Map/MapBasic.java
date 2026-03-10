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
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 0);
        map.put(2, 1);
        map.put(2, 1);
        map.put(3, 2);
        map.containsValue(2);

        System.out.println(map);
        System.out.println(map.containsValue(2));

        // TreeMap
        // ✅ Sorted by key
        TreeMap<Integer, String> map2 = new TreeMap<>();

        map2.put(4, "Csd");
        map2.put(3, "C");
        map2.put(1, "Java");
        System.out.println(map2);

        int a = 12321;
        int orignal = a;
        int rev = 0;

        while (a != 0) {
            int digit = a % 10;
            rev = rev * 10 + digit;
            a = a / 10;
        }
        System.out.println(rev == orignal);

        HashMap<Character, Integer> hs = new HashMap<>();
        hs.put('I', 1);
        hs.put('V', 5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('C', 100);
        hs.put('D', 500);
        hs.put('M', 1000);

        String sk = "MCMXCIV";
        int sum = hs.get(sk.charAt(sk.length() - 1));
        int prev = hs.get(sk.charAt(sk.length() - 1));
        for (int i = sk.length() - 2; i >= 0; i--) {
            int present = hs.get(sk.charAt(i));
            if(present < prev){
                sum = sum - present;
                prev = present;
            } else {
                sum = sum + present;
                prev = present;
            }
            System.out.println(sum);
        }

    }
}

// 🔥 Interview Golden Line
// ✅ List → Ordered + Duplicate
// ✅ Set → Unique values
// ✅ Map → Key-Value pair
