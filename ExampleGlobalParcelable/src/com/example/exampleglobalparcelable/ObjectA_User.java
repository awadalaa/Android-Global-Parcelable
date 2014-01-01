package com.example.exampleglobalparcelable;

import java.util.Date;


public class ObjectA_User extends GlobalParcelable {
	private Date createdOn;
	private String username;
	private String firstName;
	
	public ObjectA_User() {}
	
	public ObjectA_User(String username, String firstName, Date createdOn) {
		this.username = username;
		this.firstName = firstName;
		this.createdOn = createdOn;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String name) {
		this.username = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
}
