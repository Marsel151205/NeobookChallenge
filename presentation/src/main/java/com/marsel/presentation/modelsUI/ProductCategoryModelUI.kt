package com.marsel.presentation.modelsUI

import com.marsel.domain.models.ProductCategoryModel
import com.marsel.presentation.tools.BaseDiffModel

data class ProductCategoryModelUI(
    override val id: Int,
    val name: String,
    val image: String
) : BaseDiffModel<Int>

fun ProductCategoryModel.toUI() = ProductCategoryModelUI(
    id = id,
    name = name,
    image = image
)
