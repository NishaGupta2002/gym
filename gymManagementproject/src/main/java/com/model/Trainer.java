package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Trainer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int trainerId;
	private String trainerName;
	private long trainer_contactno;
	private String trainer_Experience;
	private String trainer_email;

	@OneToMany(mappedBy = "trainer")
	private Schedules schedule;

	public Trainer() {
		super();
	}

	public Trainer(int trainerId, String trainerName, long trainer_contactno, String trainer_Experience,
			String trainer_email, Schedules schedule) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.trainer_contactno = trainer_contactno;
		this.trainer_Experience = trainer_Experience;
		this.trainer_email = trainer_email;
		this.schedule = schedule;
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public long getTrainer_contactno() {
		return trainer_contactno;
	}

	public void setTrainer_contactno(long trainer_contactno) {
		this.trainer_contactno = trainer_contactno;
	}

	public String getTrainer_Experience() {
		return trainer_Experience;
	}

	public void setTrainer_Experience(String trainer_Experience) {
		this.trainer_Experience = trainer_Experience;
	}

	public String getTrainer_email() {
		return trainer_email;
	}

	public void setTrainer_email(String trainer_email) {
		this.trainer_email = trainer_email;
	}

	public Schedules getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedules schedule) {
		this.schedule = schedule;
	}


	



}
