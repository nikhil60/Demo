package com.example.demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;
	
	public List getAllTopics()
	{
		return (List<Topic>) this.topicRepository.findAll();
	}
	
	public Topic getTopic(Integer id)
	{
		
		return  this.topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		this.topicRepository.save(topic);
	}

	public void update(Topic topic, Integer id) {
		this.topicRepository.save(topic);
	}

	public void delete(Integer id) {
		this.topicRepository.delete(id);
	}

}
