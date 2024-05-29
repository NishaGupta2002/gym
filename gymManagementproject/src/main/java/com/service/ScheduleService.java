package com.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.exception.ResourcesNotFoundException;
import com.model.Schedules;

public interface ScheduleService {

       public List<Schedules> getAllSchedules(int id, Schedules schedule);
       public	Optional<Schedules> getScheduleById(int id);
	  public  Schedules addSchedule(Schedules schedule);
	  public   Schedules updateSchedule(int id, Schedules schedule);
	  public Map<String,Object>deletSchedule(int id) throws ResourcesNotFoundException;
}
