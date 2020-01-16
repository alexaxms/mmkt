package com.alexaxms.persistence.mock

import com.alexaxms.application.port.out.LoadCategoriesPort
import com.alexaxms.application.port.out.SaveCategoryPort
import com.alexaxms.domain.entities.Category

class CategoryRepository : LoadCategoriesPort, SaveCategoryPort {
    override fun getCategories(): List<Category> {
        return listOf(Category(1, "Guitarras"))
    }

    override fun save(category: Category): Category {
        return Category(1, "Guitarras")
    }

}