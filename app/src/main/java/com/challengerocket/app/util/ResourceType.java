package com.challengerocket.app.util;

public enum ResourceType {
    TASK("Tareas");

    private String field;

    ResourceType(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
