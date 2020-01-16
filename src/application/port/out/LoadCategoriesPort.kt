package com.alexaxms.application.port.out

import com.alexaxms.domain.entities.Category

interface LoadCategoriesPort {
    fun getCategories(): List<Category>
}