package com.cg.proj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.proj.entity.Mechanic;

/**
 * @author Bijit Ghosh
 *
 */
@Repository
public interface MechanicDAO extends JpaRepository<Mechanic, Integer> {
	@Query("from Mechanic where mechanicLocation=:mloc")
	public List<Mechanic> getMechanics(@Param("mloc") String location);

}
