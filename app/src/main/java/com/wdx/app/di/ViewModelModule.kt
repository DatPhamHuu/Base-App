package com.wdx.app.di

import com.wdx.app.ui.main.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appViewModelModule = module {
    viewModel { HomeViewModel(get()) }
}