package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	public List getCoursebyTopic(Topic topic)
	{
		return (List<Course>) this.courseRepository.findByTopic(topic);
	}
	public void addCourse(Course course)
	{
		this.courseRepository.save(course);
	}
	public void updateCourse(Course course)
	{
		this.courseRepository.save(course);
	}
	public void deleteCourse(Integer id)
	{
		this.courseRepository.delete(id);
	}
}
