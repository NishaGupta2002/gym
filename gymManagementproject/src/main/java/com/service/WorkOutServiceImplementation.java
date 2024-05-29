package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.WorkOutRepository;
import com.exception.ResourcesNotFoundException;
import com.model.Trainer;
import com.model.WorkOut;

@Service
public class WorkOutServiceImplementation implements WorkOutService{

	@Autowired
	WorkOutRepository workoutRepo;
	
	@Override
	public WorkOut addWorkOut(WorkOut workout) {
		// TODO Auto-generated method stub
		return workoutRepo.save(workout);
	}

	@Override
	public List<WorkOut> getAllWorkouts() {
        return workoutRepo.findAll();

	}

	@Override
	public WorkOut getWorkoutById(int id) {
		return workoutRepo.findById(id).orElse(null);

	}

	@Override
	public WorkOut updateWorkout(int id, WorkOut workout) {
		 WorkOut work = getWorkoutById(id);
	        work.setWorkoutName(workout.getWorkoutName());
	        work.setDiet_plan(workout.getDiet_plan());
	        // set other attributes
	        
	        return workoutRepo.save(work);
	}

	@Override
	public Map<String, Object> deletWorkOut(int id) throws ResourcesNotFoundException {
		WorkOut workout = workoutRepo.findById(id).orElseThrow(() -> new ResourcesNotFoundException ("Workout Does not Exits"));
		workoutRepo.delete(workout);
		Map<String, Object> response = new HashMap<>();
		if(workout==null)
		     response.put("Not Deleted:","Error while deteting");
		else
			 response.put("Successfully Deleted:", "workout Deleted Successfully");
		
		return response;
	}
	

	
}
