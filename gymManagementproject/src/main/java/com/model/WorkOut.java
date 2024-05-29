package com.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class WorkOut {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int workoutId;
	private String workoutName;
	private String diet_plan;
	
//	@ManyToOne
//	private Trainer trainer;
	
	
	 @OneToMany(mappedBy = "workout", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Schedules> schedule;

	public WorkOut() {
		super();
	}

	public WorkOut(int workoutId, String workoutName, String diet_plan, List<Schedules> schedule) {
		super();
		this.workoutId = workoutId;
		this.workoutName = workoutName;
		this.diet_plan = diet_plan;
		this.schedule = schedule;
	}

	public int getWorkoutId() {
		return workoutId;
	}

	public void setWorkoutId(int workoutId) {
		this.workoutId = workoutId;
	}

	public String getWorkoutName() {
		return workoutName;
	}

	public void setWorkoutName(String workoutName) {
		this.workoutName = workoutName;
	}

	public String getDiet_plan() {
		return diet_plan;
	}

	public void setDiet_plan(String diet_plan) {
		this.diet_plan = diet_plan;
	}

	public List<Schedules> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Schedules> schedule) {
		this.schedule = schedule;
	}

	
	
	
}
