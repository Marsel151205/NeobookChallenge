package com.marsel.data.remote.services

import com.marsel.data.remote.dtos.ProductCategoryDto
import retrofit2.http.GET

interface ProductCategoryApiService {

    @GET("product-category-list/")
    suspend fun fetchProductCategory(): List<ProductCategoryDto>
}