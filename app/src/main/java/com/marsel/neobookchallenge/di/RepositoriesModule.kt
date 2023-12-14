package com.marsel.neobookchallenge.di

import com.marsel.data.repositories.ProductCategoryRepositoryImpl
import com.marsel.domain.repositories.ProductCategoryRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun bindProductCategoryRepository(productCategoryRepositoryImpl: ProductCategoryRepositoryImpl): ProductCategoryRepository
}