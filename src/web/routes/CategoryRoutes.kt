package com.alexaxms.web.routes

import com.alexaxms.domain.entities.Category
import com.alexaxms.web.controllers.CategoriesController
import io.ktor.application.call
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.route
import org.koin.ktor.ext.inject

fun Route.categoryRoutes() {
    val categoriesController: CategoriesController by inject()
    route("/categories") {
        get("") {
            call.respond(mapOf("categories" to categoriesController.getCategories()))
        }

//        get("/{id}") {
//            // code to get a specific ticket
//        }
//
        post("/") {
            val params = call.receive<Category>()
            call.respond(categoriesController.createCategory(params))
        }
    }

//        delete("/{id}") {
//            // delete an existing ticket
//        }

}
