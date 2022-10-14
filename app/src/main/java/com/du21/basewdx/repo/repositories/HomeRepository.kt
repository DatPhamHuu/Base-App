package com.du21.basewdx.repo.repositories

import callApi
import com.du21.basewdx.repo.ApiService
import com.du21.basewdx.repo.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import kotlin.reflect.typeOf

class HomeRepository(private val service: ApiService) {

    fun getConfiguration() = callApi { service.getConfiguration() }
}