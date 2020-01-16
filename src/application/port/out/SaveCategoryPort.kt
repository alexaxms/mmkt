package com.alexaxms.application.port.out

import com.alexaxms.domain.entities.Category

interface SaveCategoryPort {
    fun save(category: Category): Category
}