
import java.util.Scanner;

class ControlStatment {

    public static void main(String[] args) {
        // if / else
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is evenn");
        } else {
            System.out.println("Number is odd");
        }

        System.out.println("#############################################");
        // switch case

        switch (number) {
            case 1:
                System.out.println("Case1");
            case 2:
                System.out.println("Case2");
                break;
            default:
                System.out.println("default");
        }

        System.out.println("#############################################");
        // for loop

        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        System.out.println("#############################################");

        // While loop
        // In Java, a while loop is used when you want to repeat a block of code while a condition is true.
        while (number < 10) {
            System.out.print(number);
            number++;
        }
        System.out.println();

        System.out.println("#############################################");

        // Do While loop
        // In Java, a while loop is used when you want to repeat a block of code while a condition is true.
        int num = 1;
        do {
            System.out.println("doWhile"+ num);
            num++;
        } while (num <= 5);
        num++;

    }
}
