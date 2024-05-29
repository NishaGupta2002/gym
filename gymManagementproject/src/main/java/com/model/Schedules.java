package com.model;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Schedules {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int s_id;
	
	

	@ManyToOne
	@JoinColumn(name = "trainer_id")
	private Trainer trainer;

  
	
	 @ManyToOne
	    @JoinColumn(name = "workout_id")
	    private WorkOut workout;
	 
    
    
    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

	public Schedules() {
		super();
	}

	public Schedules(int s_id, Trainer trainer, WorkOut workout, LocalTime startTime, LocalTime endTime) {
		super();
		this.s_id = s_id;
		this.trainer = trainer;
		this.workout = workout;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public WorkOut getWorkout() {
		return workout;
	}

	public void setWorkout(WorkOut workout) {
		this.workout = workout;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	
}
