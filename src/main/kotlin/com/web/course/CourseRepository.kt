package com.web.course

import org.springframework.data.repository.CrudRepository

/**
 * Data layer that gets all the CRUD methods needed to perform CRUD operation on relation Course.
 * */

interface CourseRepository: CrudRepository<Course, String> {

    fun findByTopicId(id: String): List<Course>
}