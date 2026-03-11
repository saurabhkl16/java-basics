
class ThisDemo {

    String name;
    int rollNumber;

    public void student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void student() {
        this.student("Saurabh", 21);
        System.out.println(name + " " + rollNumber);
    }
}

class ThisAndSuper {

    public static void main(String[] args) {
        ThisDemo s = new ThisDemo();
        s.student();
    }
}
