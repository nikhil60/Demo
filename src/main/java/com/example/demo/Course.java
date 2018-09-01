package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Course {
	@Id
	private Integer courseId;
	private String courseName,couseDesc;
	@ManyToOne
	private Topic topic;
	
	public Course()
	{}
	
	public Course(Integer courseId,String courseName,String courseDesc,Topic topic)
	{
		this.courseId=courseId;
		this.courseName=courseName;
		this.couseDesc=courseDesc;
		this.topic=topic;
	}
	
	public Integer getCourseId() {
		return courseId;
	}
	
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCouseDesc() {
		return couseDesc;
	}
	
	public void setCouseDesc(String couseDesc) {
		this.couseDesc = couseDesc;
	}

	public Topic getTopic() {
		return topic;
	}
	
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}
