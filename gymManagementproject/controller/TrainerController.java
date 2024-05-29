package com.controller;

import java.util.List;
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

import com.model.Trainer;
import com.service.TrainerService;

@RestController
//@RequestMapping("/trainer")
public class TrainerController {

	@Autowired
	TrainerService trainerService;
	
	@PostMapping("/addTrainer")
	
	    public ResponseEntity<Trainer> addTrainer(@RequestBody Trainer trainer) {
	        Trainer savedTrainer = trainerService.addTrainer(trainer);
	        return new ResponseEntity<>(savedTrainer, HttpStatus.CREATED);
	    }
	 @GetMapping("/{id}")
	    public Optional<Trainer> getTrainerById(@PathVariable("id") int id) {
	       Optional< Trainer> trainer = trainerService.getTrainerById(id);
	        return trainerService.getTrainerById(id);
	    }
	 @GetMapping
	    public ResponseEntity<List<Trainer>> getAllTrainers() {
	        List<Trainer> trainers = trainerService.getAllTrainers();
	        return new ResponseEntity<>(trainers, HttpStatus.OK);
	    }
	 @PutMapping("/{id}")
	    public ResponseEntity<Trainer> updateTrainer(@PathVariable("id") int id, @RequestBody Trainer trainer) {
	        Trainer updatedTrainer = trainerService.updateTrainer(id, trainer);
	        return new ResponseEntity<>(updatedTrainer, HttpStatus.OK);
	    }
	 @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteTrainer(@PathVariable("id") int id) {
	        trainerService.deleteTrainer(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
}
