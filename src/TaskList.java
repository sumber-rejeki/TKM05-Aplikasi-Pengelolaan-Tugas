import java.util.LinkedList;

public class TaskList {
    private LinkedList<Task> tasks;

    public TaskList() {
        tasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println(task.toString());
        }
    }
}