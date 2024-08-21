import java.util.Scanner;

public class IT24101574Lab5Q1 {
    public static void main(String[] args) {
        int num1, num2, num3;

	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        num2 = scanner.nextInt();

        System.out.print("Enter third integer: ");
        num3 = scanner.nextInt();

	System.out.println("User entered numbers are: " + num1 + " " + num2 + " " + num3);

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The Largest number is: " + num1);
            if (num2 <= num3) {
                System.out.println("The Smallest number is: " + num2);
            } else {
                System.out.println("The Smallest number is: " + num3);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The Largest number is: " + num2);
            if (num1 <= num3) {
                System.out.println("The Smallest number is: " + num1);
            } else {
                System.out.println("The Smallest number is: " + num3);
            }
        } else {
            System.out.println("The Largest number is: " + num3);
            if (num1 <= num2) {
                System.out.println("The Smallest number is: " + num1);
            } else {
                System.out.println("The Smallest number is: " + num2);
            }
        }
    }
}
