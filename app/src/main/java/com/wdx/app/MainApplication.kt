package com.wdx.app

import android.app.Application
import com.wdx.app.di.appNetworkModule
import com.wdx.app.di.appUserCaseModule
import com.wdx.app.di.appViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(
                appNetworkModule,
                appViewModelModule,
                appUserCaseModule
            )
        }
    }
}