package com.controller;


import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exception.ResourcesNotFoundException;
import com.model.Schedules;
import com.model.Trainer;
import com.service.ScheduleService;

@RestController
public class ScheduleController {

	@Autowired
	ScheduleService scheduleService;
	
	@PostMapping("/addschedule")
	
	public Schedules handlePostRequest(@RequestBody Schedules schedule)
	{
		return scheduleService.addSchedule(schedule);
		
	}
//	
//        public ResponseEntity<Schedules> addSchedules(@RequestBody Schedules schedule) {
//        Schedules savedSchedule =scheduleService.addSchedule(schedule);
//        return new ResponseEntity<>(savedSchedule, HttpStatus.CREATED);
//    }
	
	@GetMapping("/getSchedule/{id}")
    public Optional<Schedules> getScheduleById(@PathVariable("id") int id) {
       Optional<Schedules> schedule = scheduleService.getScheduleById(id);
        return scheduleService.getScheduleById(id);
    }
	
	@GetMapping("/getAllSchedules")
//    public ResponseEntity<List<Trainer>> getAllTrainers() { //trainers = trainerService.getAllTrainers
       public List<Schedules> getAllSchedules(Schedules schedule){
//        return new ResponseEntity<>(trainers, HttpStatus.OK);
	 return scheduleService.getAllSchedules(0, schedule);
    }
// @PutMapping("/updateschedule/{id}")
//    public ResponseEntity<Schedules> updateSchedule(@PathVariable("id") int id, @RequestBody Schedules schedule) {
//        Schedules updatedSchedule =scheduleService.updateSchedule(id, schedule);
//        return new ResponseEntity<>(updatedSchedule, HttpStatus.OK);
//    }
// 
	@PutMapping("/updateSchedule")
	 public ResponseEntity<Schedules> updateSchedules(@RequestBody Schedules schedule) throws ResourcesNotFoundException {
	     Schedules updatedPlayer = scheduleService.updateSchedule(0, schedule);
	     
	     return ResponseEntity.ok().header("updated", "player updated").body(schedule);
	 }
	
 @DeleteMapping("/deleteSchedule/{id}")
 public ResponseEntity<Map<String, Object>> deleteSchedule(@PathVariable int id) throws ResourcesNotFoundException
	{
	 Map<String, Object> res = null;
	
		res = scheduleService.deletSchedule(id);

	return ResponseEntity.ok(res);
		
	}
}
