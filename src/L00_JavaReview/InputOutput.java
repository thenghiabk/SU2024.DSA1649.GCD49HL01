package L00_JavaReview;

import java.text.MessageFormat;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        System.out.println("Hello, " + name + ". Your age is " + age + ". Your salary is " + salary + ".");

        String formattedMsg = "Hello, {0}. Your age is {1}. Your salary is {2}.";
        System.out.println(MessageFormat.format(formattedMsg, name, age, salary));

        if (age < 20){
            System.out.println("You're so talent.");
        } else {
            System.out.println("Keep fighting !");
        }

    }
}
