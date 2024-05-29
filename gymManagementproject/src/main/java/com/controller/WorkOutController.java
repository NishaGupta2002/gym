package com.controller;

import java.util.List;
import java.util.Map;

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
import com.model.WorkOut;
import com.service.WorkOutService;

@RestController
public class WorkOutController {
	

	@Autowired
	WorkOutService workoutService;
	
	@PostMapping("/addwout")
	public WorkOut addWorkOut(@RequestBody WorkOut workout)
	{
		return workoutService.addWorkOut(workout);
	
	}
	
	  @GetMapping("/getAllworkouts")
	    public List<WorkOut> getAllWorkouts(WorkOut workout){
		 return workoutService.getAllWorkouts();
	 }
	    
	    // Get a specific workout by ID
	    @GetMapping("/getWorkoutid/{id}")
		  public ResponseEntity<WorkOut> getoneWorkOut(@PathVariable("id") int id) 
		  {
			 WorkOut w1=workoutService.getWorkoutById(id);
			  return ResponseEntity.status(HttpStatus.OK).header("Get", "workout get").body(w1);
		  }
	   

	// Update an existing workout
    @PutMapping("/updateWorkout/{id}")
    public ResponseEntity<WorkOut> updateWorkout(@PathVariable("id") int id, @RequestBody WorkOut workout) {
        WorkOut updatedWorkout = workoutService.updateWorkout(id, workout);
        return new ResponseEntity<>(updatedWorkout, HttpStatus.OK);
    }


   @DeleteMapping("/deleteworkout")
   public ResponseEntity<Map<String, Object>> deleteWorkOut(@PathVariable int id) throws ResourcesNotFoundException
		{
		 Map<String, Object> res = null;
		
			res = workoutService.deletWorkOut(id);
	
		return ResponseEntity.ok(res);
			
		}

   

}
