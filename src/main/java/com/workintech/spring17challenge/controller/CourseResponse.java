package com.workintech.spring17challenge.controller;

import com.workintech.spring17challenge.entity.Course;

public record CourseResponse(Course course, int totalGpa) {
}
