package com.du21.basewdx.di

import com.du21.basewdx.ui.main.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appViewModelModule = module {
    viewModel { HomeViewModel(get()) }
}