// 1. Encapsulation (Data Hiding)
//    Wrapping data + methods into a single unit (Class)
//    and restricting direct access.
// ✔ Protect data
// ✔ Control access
// ✔ Use private variables
// ✔ Access using Getter & Setter

class Student {

    private int marks;

    public void setMarks(int m) {
        this.marks = m;
    }

    public int getMarks() {
        return marks;
    }
}

class Encapsulation {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setMarks(99);
        System.out.println(s1.getMarks());
    }
}
