package com.wdx.app.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.wdx.domain.usercase.GetConfigurationUserCase

class HomeViewModel(private val getConfigUserCase: GetConfigurationUserCase) : ViewModel() {
    fun getConfig() = getConfigUserCase.getConfiguration().asLiveData()

}