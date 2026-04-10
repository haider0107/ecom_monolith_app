package com.ecommerce.project.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    String resourceName;
    String fieldName;
    Long fieldId;
    String field;

    public ResourceNotFoundException(){
    }

    public ResourceNotFoundException(String field, Long fieldId, String resourceName) {
        super("Resource not found with " + field + " = " + fieldId + " and resource name = " + resourceName);
        this.field = field;
        this.fieldId = fieldId;
        this.resourceName = resourceName;
    }

    public ResourceNotFoundException(String resourceName, String fieldName, String field) {
        super("Resource not found with " + fieldName + " = " + field + " and resource name = " + resourceName);
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.field = field;
    }
}
