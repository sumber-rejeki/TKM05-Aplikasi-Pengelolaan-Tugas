import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();

        try {
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Add Task");
                System.out.println("2. Remove Task");
                System.out.println("3. Display Tasks");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter task title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter task description: ");
                        String description = scanner.nextLine();
                        Task task = new Task(title, description);
                        System.out.print("Enter structure type (LinkedList, Stack, or Queue): ");
                        String structureType = scanner.nextLine();
                        taskList.addTask(task, structureType);
                        System.out.println("Task added successfully.");
                        break;
                    case 2:
                        System.out.print("Enter task title to remove: ");
                        String titleToRemove = scanner.nextLine();
                        boolean removed = taskList.removeTask(titleToRemove);
                        if (removed) {
                            System.out.println("Task removed successfully.");
                        } else {
                            System.out.println("Task not found.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter structure type to display tasks (LinkedList, Stack, or Queue): ");
                        String displayType = scanner.nextLine();
                        taskList.displayTasks(displayType);
                        break;
                    case 4:
                        System.out.println("Thank you!");
                        return; // Exit the program
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } finally {
            scanner.close(); // Close the scanner object
        }
    }
}
