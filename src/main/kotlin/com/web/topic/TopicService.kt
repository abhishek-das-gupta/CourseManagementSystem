package com.web.topic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Business Service that creates singleton object of Topic Service.
 * */

@Service
class TopicService {

    @Autowired
    private lateinit var topicRepository: TopicRepository

    fun getTopics(): List<Topic> {
        return topicRepository.findAll().map { it }
    }

    fun getTopic(id: String): Topic? {
        return topicRepository.findById(id).orElse(null)
    }

    fun addTopic(topic: Topic) {
        topicRepository.save(topic)
    }

    fun updateTopic(topic: Topic, id: String) {
        topicRepository.save(topic)
    }

    fun deleteTopic(id: String) {
        topicRepository.deleteById(id)
    }
}