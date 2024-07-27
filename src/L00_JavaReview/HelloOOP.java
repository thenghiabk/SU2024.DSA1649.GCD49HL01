package L00_JavaReview;

import java.text.MessageFormat;
import java.util.Scanner;

class Employee{
    // data
    private String name;
    private int age;
    private double salary;
    private String address;

    // constructor
    public Employee(String name, int age,
                    double salary, String address){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    // methods
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getSalary(){
        return this.salary;
    }
    public String getAddress(){
        return this.address;
    }

    @Override
    public String toString(){
        return this.getName() + ", " + this.getAge() + ", "
                + this.getSalary() + ", " + this.getAddress();
    }

}

public class HelloOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        Employee employee1 = new Employee(name, age, salary, "658NQ");
        Employee employee2 = new Employee("David", 18, 650.9, "659NQ");

//        System.out.println("Hello, " + employee1.getName() + ". Your age is "
//                + employee1.getAge() + ". Your salary is "
//                + employee1.getSalary() + ". Your address is "
//                + employee1.getAddress()+ ".");
//
//        System.out.println("Hello, " + employee2.getName() + ". Your age is "
//                + employee2.getAge() + ". Your salary is "
//                + employee2.getSalary() + ". Your address is "
//                + employee2.getAddress() + ".");


        System.out.println(employee1.toString());
        System.out.println(employee2);

    }
}
