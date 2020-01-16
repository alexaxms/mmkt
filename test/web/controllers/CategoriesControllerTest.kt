package com.alexaxms.application.controllers

import com.alexaxms.module
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication
import org.junit.Test
import kotlin.test.assertEquals

class CategoriesControllerTest() {
    @Test
    fun testListCategories() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/categories").apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }
}