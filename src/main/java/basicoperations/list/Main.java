package basicoperations.list;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        System.out.println("O número de elementos na lista é: " + taskList.getAllTaskList());

        taskList.addTask("Task 1");
        System.out.println("O número de elementos na lista é: " + taskList.getAllTaskList());

        taskList.addTask("Task 2");
        System.out.println("O número de elementos na lista é: " + taskList.getAllTaskList());

        taskList.getTaskListDescription();

    }
}