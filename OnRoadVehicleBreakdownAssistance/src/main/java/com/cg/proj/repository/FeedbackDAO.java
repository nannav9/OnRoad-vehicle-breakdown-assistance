package com.cg.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.proj.entity.Feedback;

@Repository
public interface FeedbackDAO extends JpaRepository<Feedback, Integer> {

}