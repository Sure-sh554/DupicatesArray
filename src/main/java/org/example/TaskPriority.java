package org.example;

public enum TaskPriority {
    LOW(1),
    MEDIUM(2),
    HIGH(3),
    URGENT(4);

    private final int value;

    TaskPriority(int value) {
        this.value = value;

    }

    public int getValue() {
        return value;
    }
    }
