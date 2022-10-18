package com.wdx.data.repository

import com.wdx.data.api.ApiService
import com.wdx.data.entities.mapToEntity
import com.wdx.domain.entities.ConfigurationResponseEntity
import com.wdx.domain.repository.ConfigurationRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.transform

class ConfigurationRepositoryImpl(private val api: ApiService) : ConfigurationRepository {
    override fun getConfiguration(): Flow<ConfigurationResponseEntity> =
        flow { emit(api.getConfiguration().mapToEntity()) }

}