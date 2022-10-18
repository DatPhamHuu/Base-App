package com.wdx.app.di

import com.wdx.app.BuildConfig
import com.wdx.data.api.ApiService
import com.wdx.data.repository.ConfigurationRepositoryImpl
import com.wdx.domain.repository.ConfigurationRepository
import org.koin.dsl.module
import retrofit2.Retrofit

val appNetworkModule = module {
    single { createNetworkClient(BuildConfig.API_END_POINT) }
    single<ApiService> {
        (get() as Retrofit).create(
            ApiService::class.java
        )
    }

    single<ConfigurationRepository> { ConfigurationRepositoryImpl(get()) }
}