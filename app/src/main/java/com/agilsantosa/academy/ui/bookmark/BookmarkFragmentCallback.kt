package com.agilsantosa.academy.ui.bookmark

import com.agilsantosa.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
