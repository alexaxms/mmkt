package com.alexaxms.domain.usecases

import com.alexaxms.domain.entities.Category
import com.alexaxms.domain.entities.Subcategory
import org.junit.Test
import kotlin.test.assertEquals

class GetAllSubcategoriesTest {
    val repository = SubcategoryRepo()
    @Test
    fun testGetAllSubcategoriesMock(){
        val category = Category("Guitarras")
        val getAllSubCategoriesUsecase = GetAllSubcategories(repository)
        assertEquals(getAllSubCategoriesUsecase.perform(), listOf(Subcategory("Guitarras electricas", category)))
    }
}