package pl.sda.jvm.memory.leaks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskManager {

    private List<Task> tasks = new ArrayList<>();
    private int nextId = 0;

    public void addTask(Task task) {
        synchronized (this) {
            task.setId(nextId);
            nextId++;
            tasks.add(task);
        }

    }

    public  Task getNextTask() {
        synchronized(this){
            Task task = tasks.get(0);
            tasks.remove(0);
            return task;
        }
    }

    public void howManyTask() {
        int size = tasks.size();
        System.out.println("Task size: " + new Date() + " : " + size);
    }

    public void displayCustomers() {
        synchronized (tasks) {
            for (Task c : tasks) {
                System.out.println(c.toString());
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }


}