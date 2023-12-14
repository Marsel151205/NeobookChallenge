package com.marsel.data.remote.dtos

import com.google.gson.annotations.SerializedName
import com.marsel.domain.models.ProductCategoryModel

data class ProductCategoryDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val image: String
)

fun ProductCategoryDto.toDomain() = ProductCategoryModel(
    id = id,
    name = name,
    image = image
)
