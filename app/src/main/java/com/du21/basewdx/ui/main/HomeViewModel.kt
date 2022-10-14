package com.du21.basewdx.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.du21.basewdx.repo.repositories.HomeRepository

class HomeViewModel(private val repo: HomeRepository):ViewModel() {
    fun getConfig() = repo.getConfiguration().asLiveData()

}