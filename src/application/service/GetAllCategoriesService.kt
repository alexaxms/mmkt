package com.alexaxms.application.service

import com.alexaxms.application.port.`in`.ListAllCategoriesQuery
import com.alexaxms.application.port.out.LoadCategoriesPort
import com.alexaxms.domain.entities.Category

class GetAllCategoriesService(private val loadCategoriesPort: LoadCategoriesPort): ListAllCategoriesQuery {
    override fun perform(): List<Category> {
        return loadCategoriesPort.getCategories()
    }
}