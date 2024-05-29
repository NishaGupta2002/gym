package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Schedules;


public interface ScheduleRepository extends JpaRepository<Schedules, Integer> {

}
