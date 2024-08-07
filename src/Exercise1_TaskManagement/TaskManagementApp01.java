package Exercise1_TaskManagement;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagementApp01 {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task Management Application");
        System.out.println("--------------------------");
        int choice = 0;

        // mockup data
        tasks.add("Buy a cup of coffee");
        tasks.add("Watch a movie");
        tasks.add("Hangout with friends");



        while (choice != 4) {
            displayMenu();

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Adding a task");
                    addTask(tasks, scanner);
                    break;
                case 2:
                    System.out.println("Removing a task");
                    removeTask(tasks, scanner);
                    break;
                case 3:
                    System.out.println("Displaying all tasks");
                    displayTasks(tasks);
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
        System.out.print("Please enter a choice: ");
    }

    private static void addTask( ArrayList<String> tasks, Scanner scanner ) {
        System.out.print("Please enter a new task: ");
        String newTask = scanner.nextLine();
        tasks.add(newTask);
        System.out.println("Task added successfully!");
    }

    private static void removeTask( ArrayList<String> tasks, Scanner scanner ) {
        displayTasks(tasks);
        System.out.println("Please enter task you want to remove: ");
        int removedTaskIdx = Integer.parseInt(scanner.nextLine());
        String removedTask = tasks.remove(removedTaskIdx-1);
        System.out.println("Task " + removedTask + " removed successfully!");
    }

    private static void displayTasks( ArrayList<String> tasks ) {
        System.out.println("Tasks running: ");
        // System.out.println(tasks);

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("\tTask " + (i+1) + ": " + tasks.get(i));
        }
    }

}


