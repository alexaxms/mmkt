package com.alexaxms.web.module

import com.alexaxms.application.port.out.LoadCategoriesPort
import com.alexaxms.application.port.out.SaveCategoryPort
import com.alexaxms.application.service.CreateCategoryService
import com.alexaxms.application.service.GetAllCategoriesService
import com.alexaxms.persistence.mock.CategoryRepository
import com.alexaxms.web.controllers.CategoriesController
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

object KoinModuleBuilder {
    fun modules(): List<Module> = listOf(module {
        // Controllers
        single { CategoriesController(get(), get()) }

        // Services
        single<CreateCategoryService> { CreateCategoryService(get()) }
        single<GetAllCategoriesService> { GetAllCategoriesService(get()) }

        // Repositories
        single<LoadCategoriesPort> { CategoryRepository() }
        single<SaveCategoryPort> { CategoryRepository() }

    })
}