package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.FeedbackRequest;
import com.example.demo.entity.Feedback;
import com.example.demo.service.FeedbackService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/feedbacks")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/{courseId}")
    public List<Feedback> getFeedbacksForCourse(@PathVariable Long courseId) {
        return feedbackService.getFeedbacksForCourse(courseId);
    }

    @PostMapping
    public String submitFeedback(@RequestBody FeedbackRequest fr) {
        return feedbackService.submitFeedback(fr);
    }
}
