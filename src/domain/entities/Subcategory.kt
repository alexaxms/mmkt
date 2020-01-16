package com.alexaxms.domain.entities

data class Subcategory (
    val id: Long = 0,
    val name: String,
    val category: Category
)