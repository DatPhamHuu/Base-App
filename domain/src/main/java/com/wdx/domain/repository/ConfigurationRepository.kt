package com.wdx.domain.repository

import com.wdx.domain.entities.ConfigurationResponseEntity
import kotlinx.coroutines.flow.Flow

interface ConfigurationRepository {
    fun getConfiguration(): Flow<ConfigurationResponseEntity>
}