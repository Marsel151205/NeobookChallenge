package com.marsel.domain.repositories

import com.marsel.domain.models.ProductCategoryModel
import com.marsel.domain.tools.Either
import kotlinx.coroutines.flow.Flow

interface ProductCategoryRepository {

    fun fetchProductCategory(): Flow<Either<String, List<ProductCategoryModel>>>
}