package com.alexaxms.web.controllers

import com.alexaxms.application.service.CreateCategoryService
import com.alexaxms.application.service.GetAllCategoriesService
import com.alexaxms.domain.entities.Category


class CategoriesController(private val getAllCategoriesService: GetAllCategoriesService,
                           private val createCategoryService: CreateCategoryService) {

    fun getCategories(): List<Category> {
        return getAllCategoriesService.perform()
    }

    fun createCategory(category: Category): Category{
        return createCategoryService.perform(category)
    }
}