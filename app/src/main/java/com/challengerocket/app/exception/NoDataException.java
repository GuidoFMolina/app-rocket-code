package com.challengerocket.app.exception;

public class NoDataException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private String resourceName;
    private String fieldName;
    public NoDataException(String resourceName, String fieldName){
        super(String.format("No se encontró : %s : %s", resourceName, fieldName));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
    }
    public NoDataException(String resourceName){
        super(String.format("No se encontró : %s ", resourceName));
        this.resourceName = resourceName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}