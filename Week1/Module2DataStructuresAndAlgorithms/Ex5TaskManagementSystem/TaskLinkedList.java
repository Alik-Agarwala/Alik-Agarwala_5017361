package Week1.Module2DataStructuresAndAlgorithms.Ex5TaskManagementSystem;

class Node {
    Task task;
    Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskLinkedList {
    private Node head;

    // Method to add a new task at the end of the list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to search for a task by ID
    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null; // Task not found
    }

    // Method to delete a task by ID
    public void deleteTask(int taskId) {
        if (head == null) return;

        // If head node itself holds the task to be deleted
        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        while (current != null && current.task.getTaskId() != taskId) {
            previous = current;
            current = current.next;
        }

        // If task was not present in the linked list
        if (current == null) return;

        // Unlink the node from linked list
        previous.next = current.next;
    }

    // Method to traverse and display all tasks
    public void displayTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Adding tasks
        taskList.addTask(new Task(1, "Design the system", "In Progress"));
        taskList.addTask(new Task(2, "Implement the system", "Not Started"));
        taskList.addTask(new Task(3, "Test the system", "Not Started"));

        // Displaying all tasks
        System.out.println("All Tasks:");
        taskList.displayTasks();

        // Searching for a task
        System.out.println("\nSearching for task with ID 2:");
        Task foundTask = taskList.searchTask(2);
        System.out.println(foundTask != null ? foundTask : "Task not found");

        // Deleting a task
        System.out.println("\nDeleting task with ID 2:");
        taskList.deleteTask(2);
        taskList.displayTasks();
    }
}
