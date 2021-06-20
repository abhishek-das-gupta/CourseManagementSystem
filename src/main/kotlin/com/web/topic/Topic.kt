package com.web.topic

import javax.persistence.Entity
import javax.persistence.Id

/**
 * Class that encapsulates information about a topic.
 * */

@Entity
class Topic() {
    @Id
    private var id: String?= null
    private var name: String? = null
    private var description: String? = null

    constructor(id: String, name: String, description: String): this() {
        this.id = id
        this.description = description
        this.name = name
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
}