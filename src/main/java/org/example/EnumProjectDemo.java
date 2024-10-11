package org.example;


import java.time.LocalDateTime;

public class EnumProjectDemo {
    public static void main(String[] args) {
TaskManager
        taskManager=new TaskManager();
        taskManager.addTask(new Task("Implement login feature",
                TaskCategory.DEVELOPMENT, TaskStatus.TODO, TaskPriority.HIGH,
                LocalDateTime.now().plusDays(5)));
        taskManager.addTask(new Task("Implement logout feature",
                TaskCategory.TESTING, TaskStatus.IN_PROGRESS, TaskPriority.MEDIUM,
                LocalDateTime.now().plusDays(2)));
        taskManager.addTask(new Task("Implement registration feature",
                TaskCategory.DEVELOPMENT, TaskStatus.DONE, TaskPriority.LOW,
                LocalDateTime.now().plusDays(10)));


    }
}