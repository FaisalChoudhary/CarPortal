package com.carPortal.Car.Portal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carPortal.Car.Portal.Entity.Variant;

public interface VariantRepository extends JpaRepository<Variant,Integer> {

}
