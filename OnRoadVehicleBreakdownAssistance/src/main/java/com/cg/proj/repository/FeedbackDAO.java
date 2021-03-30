package com.cg.proj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.proj.entity.Feedback;

@Repository
public interface FeedbackDAO extends JpaRepository<Feedback, Integer> {
	@Query("from Feedback fb where fb.mechanic.mechanicId=:mid")
	public List<Feedback> getFeedbacks(@Param("mid") int mechanicId);
}