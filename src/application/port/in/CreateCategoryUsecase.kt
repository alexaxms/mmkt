package com.alexaxms.application.port.`in`

import com.alexaxms.domain.entities.Category

interface CreateCategoryUsecase {
    fun perform(category: Category) : Category
}