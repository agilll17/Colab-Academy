package com.agilsantosa.academy.ui.bookmark

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class BookmarkViewModelTest {

    private lateinit var viewModel: BookmarkViewModel

    @Before
    fun setup() {
        viewModel = BookmarkViewModel()
    }

    @Test
    fun getBookmark() {
        val courseEntities = viewModel.getBookmark()
        assertNotNull(courseEntities)
        assertEquals(5, courseEntities.size)
    }
}