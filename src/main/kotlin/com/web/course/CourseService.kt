package com.web.course

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Class that manages all the CRUD service at the business layer.
 * */

@Service
class CourseService {

    @Autowired
    private lateinit var courseRepository: CourseRepository

    fun getAllCourses(topicId: String): List<Course> {
        return courseRepository.findByTopicId(topicId)
    }

    fun getCourse(id: String): Course {
        return courseRepository.findById(id).orElse(null)
    }

    fun updateCourse(course: Course) {
        courseRepository.save(course)
    }

    fun deleteCourse(courseId: String) {
        courseRepository.deleteById(courseId)
    }

    fun addCourse(course: Course) {
        courseRepository.save(course)
    }
}