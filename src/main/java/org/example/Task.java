package org.example;

import java.time.LocalDateTime;

public class Task {
    private String name;
    private TaskCategory category;
    private TaskStatus taskStatus;
    private TaskPriority taskPriority;
    private LocalDateTime localDateTime;

    public Task(String name, TaskCategory category, TaskStatus taskStatus, TaskPriority taskPriority, LocalDateTime localDateTime) {
        this.name = name;
        this.category = category;
        this.taskStatus = taskStatus;
        this.taskPriority = taskPriority;
        this.localDateTime = localDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskCategory getCategory() {
        return category;
    }

    public void setCategory(TaskCategory category) {
        this.category = category;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(TaskPriority taskPriority) {
        this.taskPriority = taskPriority;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return String.format("Task: %s, Priority: %s, Status: %s, " +
                        "Category: %s, Due: %s",
                name, taskPriority,
                taskStatus.getDisplayName(),
                category, localDateTime);
    }
}

