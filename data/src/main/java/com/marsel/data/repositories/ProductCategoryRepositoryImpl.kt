package com.marsel.data.repositories

import com.marsel.data.base.BaseRepository
import com.marsel.data.remote.dtos.toDomain
import com.marsel.data.remote.services.ProductCategoryApiService
import com.marsel.domain.models.ProductCategoryModel
import com.marsel.domain.repositories.ProductCategoryRepository
import com.marsel.domain.tools.Either
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ProductCategoryRepositoryImpl @Inject constructor(
    private val productCategoryApiService: ProductCategoryApiService
) : ProductCategoryRepository, BaseRepository() {

    override fun fetchProductCategory(): Flow<Either<String, List<ProductCategoryModel>>> =
        doRequest {
            productCategoryApiService.fetchProductCategory().map { it.toDomain() }
        }
}