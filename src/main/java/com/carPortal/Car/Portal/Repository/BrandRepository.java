package com.carPortal.Car.Portal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carPortal.Car.Portal.Entity.Brand;

public interface BrandRepository extends JpaRepository<Brand,Integer> {


}
