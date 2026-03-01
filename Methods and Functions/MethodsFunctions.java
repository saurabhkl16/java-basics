
class Student {

    int marks;
}

class MethodsFunctions {

    static void hello() {
        System.out.print("The sum is: ");
    }

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

    static void changeValue(int x) {
        x = 50;
        System.out.println("x:" + x);
    }

    static void change(Student s) {
        s.marks = 90;
    }

    public static void main(String[] args) {
        int y = 20;
        hello();
        add(6, 9);
        add(6, 9, 3);
        int mult = multiplication(60, 99);
        System.out.println("mult: " + mult);
        System.out.println("recursion: " + fact(3));
        changeValue(y);
        System.out.println("y:" + y);

        Student s1 = new Student();
        s1.marks = 11;
        change(s1);
        System.out.println(".()" + s1.marks);

    }
}
