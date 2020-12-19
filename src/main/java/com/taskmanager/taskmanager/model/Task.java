package com.taskmanager.taskmanager.model;

import javax.persistence.*;

@Entity
@Table(name = "Task", schema = "task-manager")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column( name = "ID")
	private long id;
	
	@Column ( name = "NAME")
	private String name;
	
	@Column ( name = "DONE")
	private boolean done;
	
	@Column ( name = "DESCRIPTION")
	private String description;
	
	public Task(long id, String name, boolean done, String description) {
		this.id = id;
		this.name = name;
		this.done = done;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
