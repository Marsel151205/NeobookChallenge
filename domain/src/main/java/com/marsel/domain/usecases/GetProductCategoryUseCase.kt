package com.marsel.domain.usecases

import com.marsel.domain.repositories.ProductCategoryRepository
import javax.inject.Inject

class GetProductCategoryUseCase @Inject constructor(
    private val productCategoryRepository: ProductCategoryRepository
) {

    operator fun invoke() = productCategoryRepository.fetchProductCategory()
}