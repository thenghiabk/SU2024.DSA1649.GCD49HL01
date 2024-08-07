package Exercise1_TaskManagement;

import java.util.ArrayList;
import java.util.Scanner;

class Task{
    // attributes
    private String name;
    private String priority;

    // constructor
    public Task(String name, String priority){
        this.name = name;
        this.priority = priority;
    }

    // methods
    public String getName(){
        return this.name;
    }

    public String getPriority(){
        return this.priority;
    }

    public String info(){
        return "Task: " + this.name + ", Priority: " + this.priority;
    }

}

public class TaskManagementApp03 {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task Management Application");
        System.out.println("--------------------------");
        int choice = 0;

        // mockup data
        //tasks.add("Buy a cup of coffee");
        //tasks.add("Watch a movie");
        //tasks.add("Hangout with friends");

        tasks.add(new Task("Buy a cup of coffee", "A"));
        tasks.add(new Task("Watch a movie", "C"));
        tasks.add(new Task("Hangout with friends", "B"));

        displayTasks(tasks);

//
//        while (choice != 4) {
//            displayMenu();
//
//            choice = Integer.parseInt(scanner.nextLine());
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Adding a task");
//                    addTask(tasks, scanner);
//                    break;
//                case 2:
//                    System.out.println("Removing a task");
//                    removeTask(tasks, scanner);
//                    break;
//                case 3:
//                    System.out.println("Displaying all tasks");
//                    displayTasks(tasks);
//                    break;
//                case 4:
//                    System.out.println("Exiting the program...");
//                    break;
//                default:
//                    break;
//            }
//        }
    }

    private static void displayMenu() {
        System.out.println( "1. Add a task" );
        System.out.println( "2. Remove a task" );
        System.out.println( "3. Display all tasks" );
        System.out.println( "4. Exit" );
        System.out.print("Please enter a choice: ");
    }

    private static void addTask( ArrayList<Task> tasks, Scanner scanner ) {
//        System.out.print("Please enter a new task: ");
//        String newTask = scanner.nextLine();
//        tasks.add(newTask);
//        System.out.println("Task added successfully!");
    }

    private static void removeTask( ArrayList<Task> tasks, Scanner scanner ) {
        displayTasks(tasks);
        System.out.println("Please enter task you want to remove: ");
        int removedTaskIdx = Integer.parseInt(scanner.nextLine());
        tasks.remove(removedTaskIdx-1);
        System.out.println("Task removed successfully!");
    }

    private static void displayTasks( ArrayList<Task> tasks ) {
        System.out.println("Tasks running: ");
        // System.out.println(tasks);

        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);

            //System.out.println("\tTask " + (i+1) + ": " + task.getName() + ", Priority: " + task.getPriority());
            System.out.println("\t" + (i+1) + ": " + task.info());
        }
    }

}


