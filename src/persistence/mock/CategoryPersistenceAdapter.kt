package com.alexaxms.persistence.mock

import com.alexaxms.application.port.out.LoadCategoriesPort
import com.alexaxms.application.port.out.SaveCategoryPort
import com.alexaxms.domain.entities.Category

class CategoryPersistenceAdapter(private val categoryRepository: CategoryRepository) : LoadCategoriesPort,
    SaveCategoryPort {

    override fun save(category: Category): Category {
        return categoryRepository.save(category)
    }

    override fun getCategories(): List<Category> {
        return categoryRepository.getCategories()
    }
}