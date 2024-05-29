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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
//	
//	 @GetMapping("/getw_Id/{id}")
//	  public ResponseEntity<WorkOut> getoneTrainer(@PathVariable("id") int id) 
//	  {
//		 WorkOut u1=workoutService.getWorkOutById(id);
//		  return ResponseEntity.status(HttpStatus.OK).header("Get", "player get").body(u1);
//	  }
//	
//	 @GetMapping("/getAllTrainer")
//	 public List<WorkOut> getAllWorkOut()
//	 {
//	        List<WorkOut> worklist=workoutService.getAllWorkOut();
//	        return worklist;
//	 }
//	 
	 
	 
//	 @PutMapping("/updatework")
//	 public ResponseEntity<WorkOut> updateWorkOut(@RequestBody WorkOut workout) { //throws PlayerNotFoundException {
//	    WorkOut updatedWorkOut= workoutService
//	     
//	     return ResponseEntity.ok().header("updated", "workout updated").body(updatedWorkOut);
//	 }
	 
	/* @DeleteMapping("/deleteplayer/{id}")
	    public ResponseEntity<String> deletePlayer(@PathVariable("id") int id) throws PlayerNotFoundException
	 	{
		 playerservice.deletePlayer(id);
	     return ResponseEntity.ok(id +" Player deleted successfully!.");
	 	}*/
	 
//	 @DeleteMapping("/deleteplayerid/{id}")
//	    public ResponseEntity<Map<String, Object>> deleteTrainer(@PathVariable int id) //throws PlayerNotFoundException
//		{
//		 Map<String, Object> res = null;
//		
//			res =workoutService.deletWorkOut(id);
//	
//		return ResponseEntity.ok(res);
//			
//		}

}
