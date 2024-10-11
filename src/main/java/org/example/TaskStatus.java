package org.example;

public enum TaskStatus {
    TODO("todo"),
    IN_PROGRESS("in progress"),
    REVIEW("review"),
    DONE("done");
    private final String displayValue;

    TaskStatus(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayName() {
        return displayValue;
    }
}
