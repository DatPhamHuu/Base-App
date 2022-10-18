package com.wdx.domain.usercase

import com.wdx.domain.extension.wrapResource
import com.wdx.domain.repository.ConfigurationRepository

class GetConfigurationUserCase(private val configurationRepository: ConfigurationRepository) {

    fun getConfiguration() = wrapResource(configurationRepository.getConfiguration())
}