package com.agilsantosa.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.agilsantosa.academy.data.CourseEntity
import com.agilsantosa.academy.utils.DataDummy

class BookmarkViewModel: ViewModel() {

    fun getBookmark(): List<CourseEntity> = DataDummy.generateDummyCourses()
}