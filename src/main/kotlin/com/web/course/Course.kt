package com.web.course

import com.web.topic.Topic
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

/**
 * Class that encapsulates relation attributes of a table that persists in a database.
 * */

@Entity
class Course() {

    @Id
    private var id: String? = null
    private var name: String? = null
    private var description: String? = null
    @ManyToOne
    private var topic: Topic? = null

    constructor(id: String, name: String, description: String, topic: Topic): this() {
        this.id = id
        this.name = name
        this.description = description
        this.topic = topic
    }

    fun getId(): String? {
        return id
    }

    fun getName(): String? {
        return name
    }

    fun getDescription(): String? {
        return description
    }

    fun getTopic(): Topic? {
        return topic
    }

    fun setTopic(topic: Topic) {
        this.topic = topic
    }
}