package com.wdx.app.di

import com.wdx.domain.usercase.GetConfigurationUserCase
import org.koin.dsl.module

val appUserCaseModule = module {
    single { GetConfigurationUserCase(get()) }
}