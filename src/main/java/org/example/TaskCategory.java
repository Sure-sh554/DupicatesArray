package org.example;

public enum TaskCategory {
    DEVELOPMENT,
    DESIGN,
    TESTING,
    DOCUMENTATION;

    public String getDescription() {
        return switch (this) {
            case DEVELOPMENT -> "Coding and implementation tasks";
            case DESIGN -> "UI/UX and architecture design tasks";
            case TESTING -> "Quality assurance and testing tasks";
            case DOCUMENTATION -> "Documentation and user guide tasks";
        };
    }
}
