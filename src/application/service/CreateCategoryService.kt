package com.alexaxms.application.service

import com.alexaxms.application.port.`in`.CreateCategoryUsecase
import com.alexaxms.application.port.out.SaveCategoryPort
import com.alexaxms.domain.entities.Category

class CreateCategoryService(private val saveCategoryPort: SaveCategoryPort): CreateCategoryUsecase {
    override fun perform(category: Category): Category {
        return saveCategoryPort.save(category)
    }
}