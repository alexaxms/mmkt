package com.alexaxms.application.port.`in`

import com.alexaxms.domain.entities.Category

interface ListAllCategoriesQuery {
    fun perform(): List<Category>
}