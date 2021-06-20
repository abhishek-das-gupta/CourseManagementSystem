package com.web.topic

import org.springframework.data.repository.CrudRepository

/**
 * Data layer that handles all the CRUD operations.
 * */

interface TopicRepository: CrudRepository<Topic, String> {
}