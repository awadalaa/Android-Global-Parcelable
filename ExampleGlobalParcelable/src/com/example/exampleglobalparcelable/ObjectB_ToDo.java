package com.example.exampleglobalparcelable;

import java.util.Date;

public class ObjectB_ToDo extends GlobalParcelable {
	
	public enum Type { 
		PRODUCTIVITY,
		TASKS,
		REMINDERS,
	}
	
	public enum Status { 
		NEW,
		HALFDONE,
		DONE,
	}
	
	public ObjectB_ToDo() {
		super();
	}
	
	public ObjectB_ToDo(ObjectA_User createdBy, Date createdOn, Type type, Status status, boolean isPushedToServer) {
		super();
		this.setCreatedBy(createdBy);
		this.setCreatedOn(createdOn);
		this.setType(type);
		this.setStatus(status);
	}
	
	private long id;
	
	private ObjectA_User createdBy;
	
	private String createdByUsername;
			
	private Date createdOn;
	
	private Type type;
	
	private Status status;

	
	
	/*
	 * Getters and Setters 
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ObjectA_User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(ObjectA_User createdBy) {
		this.createdBy = createdBy;
		this.createdByUsername = createdBy.getUsername();
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedByUsername() {
		return createdByUsername;
	}

	public void setCreatedByUsername(String createdByUsername) {
		this.createdByUsername = createdByUsername;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	
	
}