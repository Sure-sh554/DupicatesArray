package org.example;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasksByPriority(TaskPriority taskPriority) {
        return tasks.stream().filter(task -> task.getTaskPriority() == taskPriority)
                .collect(Collectors.toList());

    }

    public List<Task> getTaskByStatus(TaskStatus taskStatus) {
        return tasks.stream().filter(task -> task.getTaskStatus() == taskStatus)
                .collect(Collectors.toList());
    }

    public void printTaskSummary() {
        System.out.println("Task Summary");
        for (TaskCategory category : TaskCategory.values()) {
            long count = tasks.stream().filter(task -> task.getCategory() == category).count();
            System.out.printf("%s: %d tasks - %s%n", category, count, category.getDescription());
        }
    }
}
