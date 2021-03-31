package com.cg.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.proj.entity.Vehicle;

@Repository
public interface VehicleDAO extends JpaRepository<Vehicle,Integer> {

}
