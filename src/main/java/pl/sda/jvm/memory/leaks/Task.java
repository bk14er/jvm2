package pl.sda.jvm.memory.leaks;

public class Task {

    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Task: " + id + " : " + name;
    }

    public Task(String name) {
        this.name = name;
    }

}
