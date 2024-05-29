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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.ResourcesNotFoundException;
import com.model.Trainer;
import com.service.TrainerService;

@RestController
//@RequestMapping("/api/trainers")

public class TrainerController {
	

	@Autowired
	TrainerService trainerService;
	
	@PostMapping("/addTrainer")
	
	    public ResponseEntity<Trainer> addTrainer(@RequestBody Trainer trainer) {
	        Trainer savedTrainer = trainerService.addTrainer(trainer);
	        return new ResponseEntity<>(savedTrainer, HttpStatus.CREATED);
	    }
	
//	 @GetMapping("/getTrainer/{id}")
//	    public Optional<Trainer> getTrainerById(@PathVariable("id") int id) {
//	       Optional< Trainer> trainer = trainerService.getTrainerById(id);
//	        return trainerService.getTrainerById(id);
//	    }
	
	 @GetMapping("/getAllTrainer")
//	    public ResponseEntity<List<Trainer>> getAllTrainers() {trainers = trainerService.getAllTrainers
	       public List<Trainer> getAllTrainers(Trainer trainers){
//	        return new ResponseEntity<>(trainers, HttpStatus.OK);
		 return trainerService.getAllTrainers();
	    }
	 
	 @GetMapping("/getTrainerid/{id}")
	  public ResponseEntity<Trainer> getoneTrainer(@PathVariable("id") int id) 
	  {
		 Trainer t1=trainerService.getTrainerById(id);
		  return ResponseEntity.status(HttpStatus.OK).header("Get", "trainer get").body(t1);
	  }
	 
//	 @PutMapping("/update{id}")
//	    public ResponseEntity<Trainer> updateTrainer(@PathVariable("id") int id, @RequestBody Trainer trainer) {
//	        Trainer updatedTrainer = trainerService.updateTrainer(id, trainer);
//	        return new ResponseEntity<>(updatedTrainer, HttpStatus.OK);
//	    }
//	 @DeleteMapping("/deleteTrainer/{id}")
//	    public ResponseEntity<Void> deleteTrainer(@PathVariable("id") int id) {
//	        trainerService.deleteTrainer(id);
//	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	    }

	 @PutMapping("/updateTrainer")
	 public ResponseEntity<Trainer> updateTrainers(@RequestBody Trainer tariner) throws ResourcesNotFoundException {
	     Trainer updatedTrainer = trainerService.updateTrainer(tariner);
	     
	     return ResponseEntity.ok().header("updated", "player updated").body(updatedTrainer);
	 }

	 @DeleteMapping("/deleteTrainerid/{id}")
	    public ResponseEntity<Map<String, Object>> deleteTrainer(@PathVariable int id) throws ResourcesNotFoundException
		{
		 Map<String, Object> res = null;
		
			res = trainerService.deletTrainer(id);
	
		return ResponseEntity.ok(res);
			
		}

}
