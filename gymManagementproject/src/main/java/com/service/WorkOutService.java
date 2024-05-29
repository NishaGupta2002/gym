package com.service;

import java.util.List;
import java.util.Map;

import com.exception.ResourcesNotFoundException;
import com.model.WorkOut;

public interface WorkOutService {

	public WorkOut addWorkOut(WorkOut workout);
	
	List<WorkOut> getAllWorkouts();

    WorkOut getWorkoutById(int id);

    WorkOut updateWorkout(int id, WorkOut workout);

	public Map<String,Object>deletWorkOut(int id) throws ResourcesNotFoundException;

	
}
