package basicoperations;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description){
        taskList.add(new Task(description));
    }

    public void removeTask(String description){
        List<Task> removeTasks = new ArrayList<>();
        for(Task t : taskList){
            if(t.getDescription().equalsIgnoreCase(description)){
                removeTasks.add(t);
            }
        }
        taskList.removeAll(removeTasks);
    }
    public int getAllTaskList(){
        return taskList.size();
    }
    public void getTaskListDescription(){
        System.out.println(taskList);
    }
}
