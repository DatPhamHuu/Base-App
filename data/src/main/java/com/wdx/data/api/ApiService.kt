package com.wdx.data.api

import com.wdx.data.entities.ConfigurationResponseData
import retrofit2.http.GET

interface ApiService {
    @GET("/api/configuration")
    suspend fun getConfiguration(): ConfigurationResponseData

}