package com.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.exception.ResourcesNotFoundException;
import com.model.Trainer;

public interface TrainerService {
	
	public Trainer addTrainer(Trainer trainer);
	
	public    List<Trainer> getAllTrainers();

	public Trainer getTrainerById(int id);

	Trainer updateTrainer(Trainer traine) throws ResourcesNotFoundException;

	public Map<String,Object>deletTrainer(int id) throws ResourcesNotFoundException;
	
	

}
