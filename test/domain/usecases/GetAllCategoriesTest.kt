package com.alexaxms.domain.usecases

import com.alexaxms.persistence.mock.CategoryRepo
import com.alexaxms.domain.entities.Category
import org.junit.Test
import kotlin.test.assertEquals

class GetAllCategoriesTest {
    val repository = CategoryRepo()
    @Test
    fun testGetAllCategoriesMock(){
        val getAllCategoriesUsecase = GetAllCategories(repository)
        assertEquals(getAllCategoriesUsecase.perform(), listOf(Category("Guitarras")))
    }
}