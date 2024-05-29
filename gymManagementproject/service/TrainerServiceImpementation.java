package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TrainerRepository;
import com.model.Trainer;

@Service
public class TrainerServiceImpementation implements TrainerService{

    @Autowired
    TrainerRepository trainerRepo;
	
	@Override
	public Trainer addTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		return trainerRepo.save(trainer);
	}

	@Override
	public List<Trainer> getAllTrainers() {
		// TODO Auto-generated method stub
		return trainerRepo.findAll();
	}

	@Override
	public Optional<Trainer> getTrainerById(int id) {
		// TODO Auto-generated method stub
		return trainerRepo.findById(id);
	}

	@Override
	public Trainer updateTrainer(int id, Trainer trainer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trainer deleteTrainer(int id) {
		// TODO Auto-generated method stub
		return null;
	}




}
