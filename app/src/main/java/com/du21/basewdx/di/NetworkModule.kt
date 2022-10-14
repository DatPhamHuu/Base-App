package com.du21.basewdx.di

import com.du21.basewdx.BuildConfig
import com.du21.basewdx.repo.ApiService
import com.du21.basewdx.repo.repositories.HomeRepository
import org.koin.dsl.module
import retrofit2.Retrofit

val appNetworkModule = module {
    single { createNetworkClient(BuildConfig.API_END_POINT) }
    single<ApiService> {
        (get() as Retrofit).create(
            ApiService::class.java
        )
    }

    single { HomeRepository(get()) }
}