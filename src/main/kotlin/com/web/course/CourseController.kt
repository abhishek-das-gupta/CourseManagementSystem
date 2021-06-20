package com.web.course

import com.web.topic.Topic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * Controller class for courses that maps service to its routes.
 * */

@RestController
class CourseController {

    @Autowired
    private lateinit var courseService: CourseService

    @RequestMapping("/topics/{topicId}/courses")
    fun getAllCourses(@PathVariable topicId: String): List<Course> {
        return courseService.getAllCourses(topicId)
    }

    @RequestMapping("/topic/{topicId}/courses/{courseId}")
    fun get(@PathVariable courseId: String): Course {
        // only course id is needed since it is a primary key.
        return courseService.getCourse(courseId)
    }

    @RequestMapping(value = ["topics/{topicId}/courses"], method = [RequestMethod.POST])
    fun post(@PathVariable topicId: String, @RequestBody course: Course) {
        course.setTopic(Topic(topicId, "", ""))
        courseService.addCourse(course)
    }

    @RequestMapping(value = ["topics/{topicId}/courses/{courseId}"], method = [RequestMethod.PUT])
    fun updateCourse(@RequestBody course: Course, @PathVariable topicId: String, @PathVariable courseId: String) {
        course.setTopic(Topic(topicId, "", ""))
        courseService.updateCourse(course)
    }

    @RequestMapping(value = ["topics/{topicId}/courses/{courseId}"], method = [RequestMethod.DELETE])
    fun deleteCourse(@PathVariable courseId: String) {
        courseService.deleteCourse(courseId)
    }
}