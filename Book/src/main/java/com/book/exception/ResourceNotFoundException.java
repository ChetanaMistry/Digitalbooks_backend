package com.book.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private Object resourceName;
	private Object fieldName;
	private Object fieldValue;
	public Object getResourceName() {
		return resourceName;
	}
	public void setResourceName(Object resourceName) {
		this.resourceName = resourceName;
	}
	public Object getFieldName() {
		return fieldName;
	}
	public void setFieldName(Object fieldName) {
		this.fieldName = fieldName;
	}
	public Object getFieldValue() {
		return fieldValue;
	}
	public void setFieldValue(Object fieldValue) {
		this.fieldValue = fieldValue;
	}
	public ResourceNotFoundException(Object resourceName, Object fieldName, Object fieldValue) {
		super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
}
