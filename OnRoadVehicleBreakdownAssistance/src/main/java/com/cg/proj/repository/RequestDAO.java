package com.cg.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.proj.entity.Request;

/**
 * @author SHOBHANA
 *
 */
@Repository
public interface RequestDAO extends JpaRepository<Request, Integer> {

}