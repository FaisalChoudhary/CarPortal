package com.carPortal.Car.Portal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carPortal.Car.Portal.Entity.Model;

public interface ModelRepository extends JpaRepository<Model,Integer> {
	

}
