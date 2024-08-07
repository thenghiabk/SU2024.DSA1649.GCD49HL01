package Exercise1_TaskManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagementApp01 {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task Management Application");
        System.out.println("--------------------------");
        int choice = 0;


        while (choice != 4) {
            displayMenu();

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addTask(tasks, scanner);
                    System.out.println("Adding a task");
                    break;
                case 2:
                    System.out.println("Removing a task");
                    break;
                case 3:
                    displayTasks(tasks);
                    System.out.println("Displaying all tasks");
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println( "1. Add a task" );
        System.out.println( "2. Remove a task" );
        System.out.println( "3. Display all tasks" );
        System.out.println( "4. Exit" );
    }

    private static void addTask( ArrayList<String> tasks, Scanner scanner ) {
        System.out.print("Please enter a new task: ");
        String newTask = scanner.nextLine();
        tasks.add(newTask);
        System.out.println("Task added successfully!");
    }

    private static void removeTask( ArrayList<String> tasks, Scanner scanner ) {
        // TODO: Put your code here
    }

    private static void displayTasks( ArrayList<String> tasks ) {
        System.out.println("Tasks running: ");
        System.out.println(tasks);
    }

}


