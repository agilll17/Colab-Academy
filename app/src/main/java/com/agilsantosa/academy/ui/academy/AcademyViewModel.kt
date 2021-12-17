package com.agilsantosa.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.agilsantosa.academy.data.CourseEntity
import com.agilsantosa.academy.utils.DataDummy

class AcademyViewModel : ViewModel() {

    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()
}