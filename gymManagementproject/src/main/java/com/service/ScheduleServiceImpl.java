package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ScheduleRepository;
import com.exception.ResourcesNotFoundException;
import com.model.Schedules;
import com.model.Trainer;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	private ScheduleRepository scheduleRepo;

	@Override
	public Schedules addSchedule(Schedules schedule) {
		// TODO Auto-generated method stub
		return scheduleRepo.save(schedule);
	}
	
	

	@Override
	public Optional<Schedules> getScheduleById(int id) {
		// TODO Auto-generated method stub
		return Optional.of(scheduleRepo.findById(id).orElse(null));
	}

	@Override
	public Schedules updateSchedule(int id, Schedules schedule) {
		// TODO Auto-generated method stub
		return  scheduleRepo.save(schedule);
	}


	@Override
	public List<Schedules> getAllSchedules(int id, Schedules schedule) {
		// TODO Auto-generated method stub
		return scheduleRepo.findAll();
	}



	@Override
	public Map<String, Object> deletSchedule(int id) throws ResourcesNotFoundException {
		Schedules schedule =scheduleRepo.findById(id).orElseThrow(() -> new ResourcesNotFoundException ("Schedule Does not Exits"));
		scheduleRepo.delete(schedule);
		Map<String, Object> response = new HashMap<>();
		if(schedule==null)
		     response.put("Not Deleted:","Error while deteting");
		else
			 response.put("Successfully Deleted:", "schedule Deleted Successfully");
		
		return response;
	}
}

	

	

