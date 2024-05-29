package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TrainerRepository;
import com.exception.ResourcesNotFoundException;
import com.model.Trainer;

@Service
public class TrainerServiceImpementation implements TrainerService{

    @Autowired
    TrainerRepository trainerRepo;
	
	@Override
	public Trainer addTrainer(Trainer trainer) {
		return trainerRepo.save(trainer);
	}

	@Override
	public List<Trainer> getAllTrainers() {
		return trainerRepo.findAll();

	}

	@Override
	public Trainer getTrainerById(int id) {
		return trainerRepo.findById(id).orElse(null);

	}

	@Override
	public Trainer updateTrainer(Trainer traine) throws ResourcesNotFoundException {
		Trainer addtrainer = trainerRepo.findById(traine.getTrainerId()).orElseThrow(()->new ResourcesNotFoundException ("Trainer Does not Exits"));
		addtrainer.setTrainerName(traine.getTrainerName());
		Trainer updatetrainer=trainerRepo.save(addtrainer);
		return updatetrainer;
	}

	@Override
	public Map<String, Object> deletTrainer(int id) throws ResourcesNotFoundException {
		Trainer trainer =trainerRepo.findById(id).orElseThrow(() -> new ResourcesNotFoundException ("Trainer Does not Exits"));
		trainerRepo.delete(trainer);
		Map<String, Object> response = new HashMap<>();
		if(trainer==null)
		     response.put("Not Deleted:","Error while deteting");
		else
			 response.put("Successfully Deleted:", "trainer Deleted Successfully");
		
		return response;
	}

	
}
