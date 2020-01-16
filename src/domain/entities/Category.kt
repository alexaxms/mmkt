package com.alexaxms.domain.entities

data class Category(
    val id: Long = 0,
    val name: String,
    val subcategories: List<Subcategory> = emptyList()
)