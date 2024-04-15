public class ToDoList {
    String name;
    Task[] tasks; // objekti i klases task qe sherben si model per elementet e array .
    int totalCount;

    public ToDoList(String name, int max_number) {
        this.name = name;
        tasks = new Task[max_number];
    }

    public void addTask(Task task) {
        if (totalCount < tasks.length) {
            tasks[totalCount] = task;
            totalCount++;

        } else {
            System.out.println("You have reached the limit ");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < totalCount) {
            for (int i = index; i < totalCount - 1; i++) {
                tasks[i] = tasks[i + 1];
            }
            tasks[totalCount - 1] = null;
            totalCount--;
        }

    }

    public void displayTask() {
        System.out.println("Tasks in the : " + name + " are :");
        for (int i = 0; i < totalCount; i++) {
            System.out.println((i + 1));
            tasks[i].display();
        }

    }

    public Task getTask(int index) {

        if (index >= 0 && index < totalCount) {
            return tasks[index];
        } else {
            return null;
        }
    }
}


