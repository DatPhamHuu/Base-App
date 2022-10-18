package com.wdx.domain.extension

import com.wdx.domain.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

fun <T> wrapResource(f: Flow<T>) = flow {
    emit(Resource.loading())
    f.collect {
        emit(Resource.success(it))
    }
}.flowOn(Dispatchers.IO).catch { e ->
    e.printStackTrace()
    emit(Resource.error(null, "Error: " + e.message))
}