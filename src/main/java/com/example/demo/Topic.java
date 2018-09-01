package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	Integer topicId;
	String topicName,topicDesc;
	
	public Topic() {}
	
	public Topic(Integer topicId,String topicName,String topicDesc)
	{
		this.topicId=topicId;
		this.topicName=topicName;
		this.topicDesc=topicDesc;
	}

	public Integer getTopicId() {
		return topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicDesc() {
		return topicDesc;
	}

	public void setTopicDesc(String topicDesc) {
		this.topicDesc = topicDesc;
	}
	
	
}