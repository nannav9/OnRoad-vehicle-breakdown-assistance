package com.cg.proj;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.proj.entity.Feedback;
import com.cg.proj.exceptions.FeedbackNotFoundException;
import com.cg.proj.repository.FeedbackDAO;
import com.cg.proj.service.FeedbackServiceImpl;
@SpringBootTest
public class TestFeedbackService {
	public static Optional<Feedback> optfeedback;
	@MockBean
	private FeedbackDAO feedbackdao;
	@Autowired
	private FeedbackServiceImpl feedbackservice;

	@BeforeEach
	public void beforeeach() {
		optfeedback = Optional.of(new Feedback());
		Mockito.when(feedbackdao.findById(3)).thenReturn(optfeedback);
		Mockito.when(feedbackdao.findById(100)).thenThrow(FeedbackNotFoundException.class);
		
		
	}

	@Test
	public void testFeedbackById_01() throws FeedbackNotFoundException {
		assertNotNull(feedbackservice.getFeedback(3));

	}

	@Test
	public void testFeedbackById_02() throws FeedbackNotFoundException {
		assertThrows(FeedbackNotFoundException.class, () -> feedbackservice.getFeedback(100));

	}

	@Test
	public void testAddFeedback() throws FeedbackNotFoundException {
		assertThrows(FeedbackNotFoundException.class, () -> feedbackservice.getFeedback(120));

	}

	@Test
	public void testgetFeedback() throws FeedbackNotFoundException {
		assertNotNull(feedbackservice.getFeedback(130));

	}

	@Test
	public void testgetAllFeedback() throws FeedbackNotFoundException {
		assertThrows(FeedbackNotFoundException.class, () -> feedbackservice.getFeedback(140));

	}
}