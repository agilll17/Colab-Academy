package com.agilsantosa.academy.ui.detail

import com.agilsantosa.academy.utils.DataDummy
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class DetailCourseViewModelTest {

    private lateinit var viewModel: DetailCourseViewModel
    private val dummyCourse = DataDummy.generateDummyCourses()[0]
    private val courseId = dummyCourse.courseId

    @Before
    fun setup() {
        viewModel = DetailCourseViewModel()
        viewModel.setSelectedCourse(courseId)
    }


    @Test
    fun getCourse() {
        viewModel.setSelectedCourse(dummyCourse.courseId)
        val courseEntities = viewModel.getCourse()
        assertNotNull(courseEntities)
        assertEquals(dummyCourse.courseId, courseEntities.courseId)
        assertEquals(dummyCourse.deadline, courseEntities.deadline)
        assertEquals(dummyCourse.description, courseEntities.description)
        assertEquals(dummyCourse.imagePath, courseEntities.imagePath)
        assertEquals(dummyCourse.title, courseEntities.title)
    }

    @Test
    fun getModules() {
        val moduleEntities = viewModel.getModules()
        assertNotNull(moduleEntities)
        assertEquals(7, moduleEntities.size.toLong())
    }
}