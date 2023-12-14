package com.marsel.neobookchallenge.di

import com.marsel.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofitClient() = RetrofitClient()

    @Provides
    @Singleton
    fun provideProductCategoryApiService(retrofitClient: RetrofitClient) =
        retrofitClient.provideProductCategoryApiService()
}