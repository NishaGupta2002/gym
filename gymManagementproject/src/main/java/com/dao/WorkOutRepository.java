package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.WorkOut;

public interface WorkOutRepository extends JpaRepository<WorkOut, Integer> {

}
