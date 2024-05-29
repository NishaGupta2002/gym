package com.service;

import java.util.List;
import java.util.Optional;

import com.model.Trainer;

public interface TrainerService {
	
	public Trainer addTrainer(Trainer trainer);
	
	public    List<Trainer> getAllTrainers();

    public	Optional<Trainer> getTrainerById(int id);

	public    Trainer updateTrainer(int id, Trainer trainer);

    public Trainer  deleteTrainer(int id);
	
	

}
