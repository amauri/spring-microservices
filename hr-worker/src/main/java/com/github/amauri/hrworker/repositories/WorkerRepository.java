package com.github.amauri.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.amauri.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	
}
