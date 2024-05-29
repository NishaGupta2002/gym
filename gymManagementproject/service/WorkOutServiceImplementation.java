package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.WorkOutRepository;
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
//
//	@Override
//	public WorkOut getWorkOutById(int id) {
//		// TODO Auto-generated method stub
//		return workoutRepo.findById(id).orElse(null);
//	}
//
//	@Override
//	public List<WorkOut> getAllWorkOut() {
//		// TODO Auto-generated method stub
//		return workoutRepo.findAll();
//	}
//
//	
//
//	@Override
//	public Map<String, Object> deletWorkOut(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
