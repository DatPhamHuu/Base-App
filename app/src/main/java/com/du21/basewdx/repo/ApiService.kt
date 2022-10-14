package com.du21.basewdx.repo

import com.du21.basewdx.models.ConfigurationResponse
import retrofit2.http.GET

interface ApiService {
    @GET("/api/subscription/history")
    suspend fun getConfiguration(): ConfigurationResponse

}