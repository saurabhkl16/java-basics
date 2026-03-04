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
        LinkedList list = new LinkedList();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);
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