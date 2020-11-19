public class TaskList{
    private TaskItem[] taskList = new TaskItem[100];


    public void setTaskList(TaskItem list[]){
        taskList = list;
    }


    public  TaskItem[] getTaskList(){
        return taskList;
    }
}