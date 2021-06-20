package com.web.topic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class TopicController {

    @Autowired
    private lateinit var topicService: TopicService

    @RequestMapping("/topics")
    fun get(): List<Topic> {
        return topicService.getTopics()
    }

    @RequestMapping("/topics/{id}")
    fun get(@PathVariable id: String): Topic? {
        return topicService.getTopic(id)
    }

    @RequestMapping(value = ["/topics"], method = [RequestMethod.POST])
    fun post(@RequestBody topic: Topic) {
        topicService.addTopic(topic)
    }

    @RequestMapping(value = ["topics/{id}"], method = [RequestMethod.PUT])
    fun put(@RequestBody topic: Topic, @PathVariable id: String) {
        topicService.updateTopic(topic, id)
    }

    @RequestMapping(value = ["topics/{id}"], method = [RequestMethod.DELETE])
    fun delete(@PathVariable id: String) {
        topicService.deleteTopic(id)
    }
}