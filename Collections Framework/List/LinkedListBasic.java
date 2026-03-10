// ✅ What is Linked List?

// A Linked List is a data structure where:
// 👉 Elements are connected using nodes
// 👉 Each node stores:
// [Data | Next] → [Data | Next] → [Data | Next] → null
// ❌ Not stored in continuous memory
// ✅ Stored anywhere in memory
// Structure => class Node {
//        int data;
//        Node next;
//    }
// ✅ Why LinkedList?
// Problem with Array:
// ❌ Fixed size
// ❌ Slow insertion/deletion
import java.util.LinkedList;

class LinkedListBasic {

    public static void main(String[] args) {
        int a = 10 /0;
        LinkedList<Integer> list = new LinkedList();
        LinkedList<Integer> list1 = new LinkedList();
        LinkedList<Integer> list2 = new LinkedList();

        list1.add(2);
        list1.add(4);
        list1.add(6);
        list2.add(1);
        list2.add(3);
        list2.add(5);

        // System.out.println(list1.get(0));
        // System.out.println(list1.getFirst());
        // System.out.println(list1.getLast());
        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}

// 1️⃣ Singly Linked List
// Each node points to next node.
// 10 → 20 → 30 → null
// 2️⃣ Doubly Linked List ✅ (Java LinkedList)
// Node stores:
// Previous address
// Next address
// null ← 10 ⇄ 20 ⇄ 30 → null
